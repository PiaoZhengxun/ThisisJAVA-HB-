package chapter15_CellectionFramework.exercise.question7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao  {
    public List<Board> getBoardList(){
        List<Board> list = new ArrayList<>();
        list.add(new Board("Title1","Content1"));
        list.add(new Board("Title2","Content2"));
        list.add(new Board("Title3","Content3"));
        return list;
    }
}
