package jdbc.boardsRefactoring;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        BoardDAO boardDAO = new BoardDAO(BoardManager.getInstance());
        boardDAO.run();
    }
}
