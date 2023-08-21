package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Character> getWinner() {
        return getAllCombinations().stream()
                .filter(combination -> isAllMatching(combination))
                .findFirst()
                .map(combination -> combination.get(0));
    }

    private boolean isAllMatching(List<Character> combination) {
        return combination.stream()
                .allMatch(mark -> mark == 'x');
    }

    public List<List<Character>> getAllCombinations() {
        List<List<Character>> combinations = new ArrayList<>();
        combinations.addAll(board.getRows());
        combinations.addAll(board.getColumns());
        combinations.add(board.getLeftDiagonal());
        combinations.add(board.getRightDiagonal());
        return combinations;
    }
}
