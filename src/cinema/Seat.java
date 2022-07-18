package cinema;

public class Seat {
    private int row;
    private int column;
    private Boolean isPurchased;

    private int price;

    Seat() {}
    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.isPurchased = false;
        this.price = row <= 4 ? 10 : 8;
    };
    public Seat(int row, int column, Boolean isPurchased, int price) {
        this.row = row;
        this.column = column;
        this.isPurchased = isPurchased;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Boolean getPurchased() {
        return isPurchased;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setPurchased(Boolean available) {
        isPurchased = available;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
