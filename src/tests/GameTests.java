package tests;

import main.Board;
import main.Game;
import org.junit.Test;

import java.util.Optional;

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

    @Test
    public void knowsWhenAColumnWins() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(0, 'x');
        board.mark(3, 'x');
        assertFalse(game.hasWinner());
        board.mark(6, 'x');
        assertTrue(game.hasWinner());
    }

    @Test
    public void knowsWhenALeftDiagonalWins() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(0, 'x');
        board.mark(4, 'x');
        assertFalse(game.hasWinner());
        board.mark(8, 'x');
        assertTrue(game.hasWinner());
    }

    @Test
    public void knowsWhenARightDiagonalWins() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(2, 'x');
        board.mark(4, 'x');
        assertFalse(game.hasWinner());
        board.mark(6, 'x');
        assertTrue(game.hasWinner());
    }

    @Test
    public void knowsWhoWinnerIs() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(2, 'o');
        board.mark(4, 'o');
        board.mark(6, 'o');
        assertTrue(game.hasWinner());
        Optional<Character> winner = game.getWinner();
        assertEquals(winner, Optional.of('o'));
    }

    @Test
    public void knowsWhenThereIsNoWinner() {
        Board board = new Board();
        Game game = new Game(board);
        board.mark(2, 'x');
        board.mark(4, 'x');
        assertFalse(game.hasWinner());
        Optional<Character> winner = game.getWinner();
        assertEquals(winner, Optional.empty());
    }
}
