package main;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Board board;
    private final ArrayList<Character> cells;

    public Game(Board board) {
        this.board = board;
        this.cells = board.getCells();
    }

    public boolean hasWinner() {
        return getAllCombinations().stream()
                .filter(combination -> isAllMatching(combination))
                .count() > 0;
    }

    private boolean isAllMatching(List<Character> combination) {
        return combination.stream()
                .allMatch(mark -> mark == 'x');
    }

    public List<List<Character>> getAllCombinations() {
        List<List<Character>> combinations = new ArrayList<>();
        combinations.addAll(board.getRows());
        return combinations;
    }
}
