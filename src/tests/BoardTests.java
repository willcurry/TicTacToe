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
    public void getsRows() {
        board = new Board();
        board.mark(2, 'x');
        assertEquals(Arrays.asList('-', '-', 'x'), board.getRows().get(0));
        assertEquals(Arrays.asList('-', '-', '-'), board.getRows().get(1));
        assertEquals(Arrays.asList('-', '-', '-'), board.getRows().get(2));
    }

    @Test
    public void getsColumns() {
        board = new Board();
        board.mark(2, 'x');
        assertEquals(Arrays.asList('-', '-', '-'), board.getColumns().get(0));
        assertEquals(Arrays.asList('-', '-', '-'), board.getColumns().get(1));
        assertEquals(Arrays.asList('x', '-', '-'), board.getColumns().get(2));
    }
}
