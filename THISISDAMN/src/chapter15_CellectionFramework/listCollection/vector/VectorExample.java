package chapter15_CellectionFramework.listCollection.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        list.add(new Board("s1", "c1", "w1"));
        list.add(new Board("s2", "c2", "w2"));
        list.add(new Board("s3", "c3", "w3"));
        list.add(new Board("s4", "c4", "w4"));
        list.add(new Board("s5", "c5", "w5"));

        list.remove(2);
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subejct + "\t" + board.content + "\t" + board.writer);
        }
    }
}
