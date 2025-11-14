package restaurant.core;

public class Table {
    private int tableId;
    private boolean reserved;

    public Table(int tableId) {
        this.tableId = tableId;
        this.reserved = false;
    }

    // Getter for tableId
    public int getTableId() {
        return tableId;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }

    @Override
    public String toString() {
        return "Table{" +
               "tableId=" + tableId +
               ", reserved=" + reserved +
               '}';
    }
}
