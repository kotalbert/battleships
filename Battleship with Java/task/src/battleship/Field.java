package battleship;

/**
 * Class representing single tile of the game field.
 */
public class Field {
    private final String coordinate;
    private final int row;
    private final int column;
    private char status;

    public Field(String coordinate)
    {
        this.coordinate = coordinate;
        this.row = coordinate.charAt(0) - 'A';
        this.column = Integer.parseInt(coordinate.substring(1)) - 1;
        this.status = '~'; // water by default
    }
    public Field(int row, int column)
    {
        this.coordinate = "" + (char)('A' + row) + (column + 1);
        this.row = row;
        this.column = column;
        this.status = '~'; // water by default
    }
    public String toString() {
        return String.valueOf(status);
    }
}
