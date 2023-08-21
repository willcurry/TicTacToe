package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Board {
    private ArrayList<Character> cells;
    public Board() {
        this.cells = new ArrayList<>();
        for (int i=0; i<9; i++) {
            this.cells.add('-');
        }
    }

    public ArrayList<Character> getCells() {
        return cells;
    }

    public void mark(int position, Character player) {
       cells.set(position, player);
    }

    public boolean hasWinner() {
        return getRows().stream()
                .filter(row -> isAllMatching(row))
                .count() > 0;
    }

    private boolean isAllMatching(List<Character> row) {
        return row.stream()
                .allMatch(mark -> mark == 'x');
    }

    private List<List<Character>> getRows() {
        List<List<Character>> rows = new ArrayList<>();
        for (int i=0; i<3;i++) {
            int start = i * 3;
            int end = start + 3;
            rows.add(cells.subList(start, end));
        }
        return rows;
    }
}
