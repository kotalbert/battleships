package battleship;

public class Ship {
    private final Field front;
    private final Field back;

    public Ship(String frontCoord, String backCoord) {
        this.front = new Field(frontCoord);
        this.back = new Field(backCoord);
    }

    public int getLength() {
        if (front.row == back.row) {
            return Math.abs(back.column - front.column) + 1;
        } else {
            return Math.abs(back.row - front.row) + 1;
        }
    }

    /**
     * Get the coordinates occupied by the ship
     *
     * @return a String array of coordinates occupied by the ship
     */
    public String[] getShipCoordinates() {
        int length = getLength();
        String[] coordinates = new String[length];
        if (front.row == back.row) {
            // Horizontal ship
            int startCol = Math.min(front.column, back.column);
            for (int i = 0; i < length; i++) {
                coordinates[i] = "" + (char) ('A' + front.row) + (startCol + i + 1);
            }
        } else {
            // Vertical ship
            int startRow = Math.min(front.row, back.row);
            for (int i = 0; i < length; i++) {
                coordinates[i] = "" + (char) ('A' + startRow + i) + (front.column + 1);
            }
        }
        return coordinates;

    }

    public String toString() {
        return "Length: " + getLength() + "\n" +
                String.join(" ", getShipCoordinates());

    }
}
