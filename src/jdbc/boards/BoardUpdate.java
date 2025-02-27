package jdbc.boards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        //Optional<Connection> connectionOptional = Optional.empty();

        try {
            // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!" + connection);

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            //getConnection은 try-catch로 묶어야함
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
            System.out.println("connection OK = " + connection);

            String query = new StringBuilder()
                    .append("UPDATE boards SET ")
                    .append("btitle = ? ")
                    .append("WHERE bno = ?").toString();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "봄,여름,가을,겨울");
            preparedStatement.setInt(2, 1);



            // 4. SQL문 실행  쿼리문을 담아서 DBMS로 전송!
            //preparedStatement.executeUpdate();

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " rows update");

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
