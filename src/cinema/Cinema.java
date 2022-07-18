package cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private int totalRows;
    private int totalColumns;
    List<Seat> available_seats;

    public Cinema(int totalRows, int totalColumns) {
        this.totalColumns = totalColumns;
        this.totalRows = totalRows;
        this.available_seats = new ArrayList<>();
        for (int row = 1; row <= totalRows; row++) {
            for (int column = 1; column <= totalColumns; column++) {
                this.available_seats.add(new Seat(row, column));
            }
        }
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public void setAvailable_seats(List<Seat> available_seats) {
        this.available_seats = available_seats;
    }
}
