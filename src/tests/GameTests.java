package tests;

import main.Board;
import main.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.*;

public class GameTests {
    @Test
    public void knowsWhenARowWins() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(0, 'x');
        board.mark(1, 'x');
        assertFalse(game.hasWinner());
        board.mark(2, 'x');
        assertTrue(game.hasWinner());
    }
}
