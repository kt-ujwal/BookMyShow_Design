package bookmyshow;

public class Seat {
    private final String id;
    private final int row;
    private final int column;
    private final SeatType seatType;
    private SeatStatus status;
    private final double price;

    public Seat(String id, int row, int column, SeatType seatType, double price) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.seatType = seatType;
        this.price = price;
        this.status = SeatStatus.AVAILABLE;
    }

    public String getId() {
        return id;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public double getPrice() {
        return price;
    }
    public SeatStatus getStatus() {
        return status;
    }
    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}
