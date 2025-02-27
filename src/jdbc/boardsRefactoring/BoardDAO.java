package jdbc.boardsRefactoring;

import jdbc.boards.Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static jdbc.boardsRefactoring.BoardManager.connection;

public class BoardDAO {
    /*
        crud기능
     */
    BoardManager boardManager;

    public BoardDAO(BoardManager boardManager) {
        this.boardManager = boardManager;
    }


    public void run() {
        try {
            boardManager.run();
            boardInsert();
            boardSelectAll();
            boardDelete();
            boardUpdate();
            boardSelectAll();

        } catch (SQLException | FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private void boardUpdate() throws SQLException {
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
    }

    private void boardDelete() throws SQLException {
        String query = new StringBuilder()
                .append("DELETE FROM boards ")
                .append("WHERE bno = ? ").toString();

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "3");

        // 4. SQL문 실행  쿼리문을 담아서 DBMS로 전송!
        //preparedStatement.executeUpdate();

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows + " rows delete");

        // 5. PreparedStatement 객체 닫기
        preparedStatement.close();
    }

    private void boardSelectAll() throws SQLException {
        ResultSet rs = null;
        String query = new StringBuilder()
                .append("SELECT * FROM boards").toString();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        rs = preparedStatement.executeQuery();
        while (rs.next()) {
            jdbc.boards.Board board = new Board();
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBwriter(rs.getString("bwriter"));
            board.setBdate(rs.getDate("bdate"));
            board.setBfilename(rs.getString("bfilename"));
            board.setBfiledata(rs.getBlob("bfiledata"));

            System.out.println(board);
        }
        preparedStatement.close();
    }

    private void boardInsert() throws SQLException, FileNotFoundException {
        String query = "" +
                "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                "VALUES (?,?,?,now(),?,?); ";
        PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, "봄이로구나");
        preparedStatement.setString(2, "봄이 오는데 하하 호호");
        preparedStatement.setString(3, "CHOI");
        preparedStatement.setString(4, "spring.jpg");
        preparedStatement.setBlob(5, new FileInputStream("src/jdbc/images/spring.jpg"));

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows + " rows inserted");
    }


}
