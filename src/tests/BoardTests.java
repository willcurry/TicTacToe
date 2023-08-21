package tests;

import main.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.*;

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

    @Test
    public void knowsWhenARowWins() {
        Board board = new Board();
        board.mark(0, 'x');
        board.mark(1, 'x');
        assertFalse(board.hasWinner());
        board.mark(2, 'x');
        assertTrue(board.hasWinner());
    }
}
