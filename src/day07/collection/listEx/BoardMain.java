package day07.collection.listEx;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        boardList.add(new Board("제목1", "글쓴이1", "예능1"));
        boardList.add(new Board("제목2", "글쓴이2", "예능2"));
        boardList.add(new Board("제목3", "글쓴이3", "예능3"));

        //저장된 글 목록 수
        int size = boardList.size();
        System.out.println("총 글의 수: " + size);

        //특정 인덱스의 객체 가져오기
        Board board1 = boardList.get(0);
        System.out.println("주제: " + board1.getContent());

        for (Board board : boardList) {
            System.out.println(board.getWriter() + " " + board.getWriter()
                    + " " + board.getContent());
        }

        //글 삭제
        boardList.remove(1);
        for (Board board : boardList) {
            System.out.println(board.getWriter() + " " + board.getWriter()
                    + " " + board.getContent());
        }

    }
}
