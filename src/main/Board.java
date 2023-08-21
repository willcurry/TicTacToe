package main;

import java.util.ArrayList;

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
}
