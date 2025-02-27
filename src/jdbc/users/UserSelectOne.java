package jdbc.users;
import java.sql.*;

public class UserSelectOne {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs = null;
        //Optional<Connection> connectionOptional = Optional.empty();

        try {
            // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok!" + connection);

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            //getConnection은 try-catch로 묶어야함
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
            System.out.println("connection OK = " + connection);

            // 3. 매개변수화된 SQL 문 작성
            /*String query = "" +
                            //"UPDATE users SET userpassword = 12345 WHERE userid = 'mycaption622'";
                            "UPDATE users SET userpassword = ? WHERE userid = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "12345");
            preparedStatement.setString(2, "mycaption622");*/

            String query = new StringBuilder()
                    .append("SELECT * FROM users ")
                    .append("WHERE userid = ?").toString();



            /*PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "ssgcom1");*/

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // 4. SQL문 실행  쿼리문을 담아서 DBMS로 전송!
            //preparedStatement.executeUpdate();

            // 1명!
            rs = preparedStatement.executeQuery();
            /*if(rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setAge(rs.getInt("userage"));
                user.setEmail(rs.getString("useremail"));
                System.out.println(user);
            } else {
                System.out.println("가입된 회원이 아닙니다.");
            }
            */
            while(rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setAge(rs.getInt("userage"));
                user.setEmail(rs.getString("useremail"));
                System.out.println(user);
            }

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
