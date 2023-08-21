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

    public List<List<Character>> getRows() {
        List<List<Character>> rows = new ArrayList<>();
        for (int i=0; i<3 ;i++) {
            int start = i * 3;
            int end = start + 3;
            rows.add(cells.subList(start, end));
        }
        return rows;
    }

    public List<List<Character>> getColumns() {
        List<List<Character>> columns = new ArrayList<>();
        for (int i=0; i<3 ;i++) {
            List<Character> column = new ArrayList<>();
            for (int j=i; j<9 ;j = j + 3) {
                column.add(cells.get(j));
            }
            columns.add(column);
        }
        return columns;
    }

    public List<Character> getLeftDiagonal() {
        List<Character> diagonal = new ArrayList<>();
        List<List<Character>> rows = getRows();
        for (int i=0; i<3 ;i++) {
            diagonal.add(rows.get(i).get(i));
        }
        return diagonal;
    }
}
