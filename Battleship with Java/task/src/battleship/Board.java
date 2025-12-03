package battleship;

public class Board {
    private final int size;
    private final Field[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Field[size][size];
        // Initialize the grid with Field objects
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Field(i, j);
            }
        }
    }

    public void printBoard() {
        // Print column numbers
        System.out.print("  ");
        for (int col = 1; col <= size; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        // Print rows with row letters
        for (int i = 0; i < size; i++) {
            // Print row letter (A-J)
            System.out.print((char) ('A' + i) + " ");

            // Print row content
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void validateCoordinates(String coord) {
        Field field = new Field(coord);
        if (field.row < 0 || field.row >= size || field.column < 0 || field.column >= size) {
            throw new IllegalArgumentException("Error: Coordinates out of bounds: " + coord);
        }
    }

}
