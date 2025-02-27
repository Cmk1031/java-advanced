package jdbc.boardsRefactoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BoardManager {
    private static BoardManager boardManagerSingleton = new BoardManager();
    static Connection connection = null;

    public void run() throws ClassNotFoundException, SQLException {
        // 1. JDBC 드라이버 등록: MYSQL DB 접근하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded ok!" + connection);

        // 2. MySQL DB에 연결객체를 얻어와서 연결하기
        //getConnection은 try-catch로 묶어야함
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("connection OK = " + connection);
    }

    public static BoardManager getInstance() { // 싱글톤 패턴 getInstance
        return boardManagerSingleton;
    }

}
