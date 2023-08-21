package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Game {
    private final Board board;

    public Game(Board board) {
        this.board = board;
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
        Character firstMark = combination.get(0);
        return combination.stream()
                .allMatch(mark -> mark == firstMark && firstMark != '-');
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
