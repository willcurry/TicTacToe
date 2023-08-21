package tests;

import main.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BoardTests {
    private Board board;
    @Before
    public void setup() {
        board = new Board();
    }
    @Test
    public void createsBoard() {
        assertEquals(Arrays.asList('-', '-', '-', '-', '-', '-', '-', '-', '-'), board.getCells());
    }

    @Test
    public void marksBoard() {
        board.mark(1, 'x');
        assertEquals(Arrays.asList('-', 'x', '-', '-', '-', '-', '-', '-', '-'), board.getCells());
    }
}
