package jdbc.users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {
    public static void main(String[] args) {
        //Optional<Connection> connectionOptional = Optional.empty();
        Connection connection = null;
        try {
            // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            //getConnection은 try-catch로 묶어야함
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
            System.out.println("connection OK = " + connection);




            // 3. 매개변수화된 SQL 문 작성
            String query = new StringBuilder()
                    .append("INSERT INTO users (userid, username, userpassword, userage, useremail)")
                    .append("VALUES (?,?,?,?,?);").toString();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"1");
            preparedStatement.setString(2,"최문규");
            preparedStatement.setString(3,"1234");
            preparedStatement.setInt(4,27);
            preparedStatement.setString(5,"mychoimoonkyu@gmail.com");

            // 4. SQL문 실행  쿼리문을 담아서 DBMS로 전송!
            //preparedStatement.executeUpdate();

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " rows inserted");

            // 5. PreparedStatement 객체 닫기
            preparedStatement.close();


        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
