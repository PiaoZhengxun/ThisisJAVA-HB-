package chapter15_CellectionFramework.exercise.question7;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();
        List<Board> list = boardDao.getBoardList();
        for (Board board :
                list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
