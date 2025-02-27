package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        //Connection connection = null;
        Optional<Connection> connection = Optional.empty();

        try {
            // 1. JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded OK = " + connection);

            // 2. MySQL DB에 연결 객체를 얻어와서 연결하기
            connection = Optional.ofNullable(DriverManager.getConnection("jdbc:mysql//localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234"));
            System.out.println("connection OK = " + connection);
        } catch (ClassNotFoundException | SQLException   e) {
            throw new RuntimeException(e);
        } finally {
            connection.ifPresent((x) -> {
                try {
                    x.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });

        }


    }
}
