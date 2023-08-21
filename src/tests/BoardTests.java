package tests;

import main.Board;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BoardTests {
    @Test
    public void createsBoard() {
        Board board = new Board();
        assertEquals(Arrays.asList('-', '-', '-', '-', '-', '-', '-', '-', '-'), board.getCells());
    }
}
