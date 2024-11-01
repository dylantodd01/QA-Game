package BoardTest;

import org.example.Board.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardTest {

    @Test
    public void testMinSizeBoardCreation(){
        assertThrows(IllegalArgumentException.class,() -> {new Board(1, 3);});
        assertThrows(IllegalArgumentException.class,() -> {new Board(4, 1);});
    }

    @Test
    public void testOccupiedSpace(){
        Board board = new Board(3,3);
    }

}
