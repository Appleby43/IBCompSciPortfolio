package project3;

/**
 * The board is where the game happens.
 */
public class Board {
    private Cell[][] cells = new Cell[3][3];

    public Board() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void printBoard(){
        String line = String.format(" %1$c | %2$c | %3$s", cells[0][0].getState().value, cells[0][1].getState().value, cells[0][1].getState().value);
        System.out.println(line);
    }
}
