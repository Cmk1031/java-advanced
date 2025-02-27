package jdbc.boards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!" + connection);

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            //getConnection은 try-catch로 묶어야함
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
            System.out.println("connection OK = " + connection);

            // 3. 매개변수화된 SQL 문 작성
            String query = "" +
                    "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                    "VALUES (?,?,?,now(),?,?); ";

            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "봄이로구나");
            preparedStatement.setString(2, "봄이 오는데 하하 호호");
            preparedStatement.setString(3, "CHOI");
            preparedStatement.setString(4, "spring.jpg");
            preparedStatement.setBlob(5, new FileInputStream("src/jdbc/images/spring.jpg"));


            // 4. SQL문 실행  쿼리문을 담아서 DBMS로 전송!
            //preparedStatement.executeUpdate();

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " rows inserted");

            if(rows == 1) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                if(rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();
            }

            // 5. PreparedStatement 객체 닫기
            preparedStatement.close();


        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
