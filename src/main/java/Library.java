import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stockList;
    private int capacity;

    public Library(int capacity) {
        stockList = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getStockCount() {
        return stockList.size();
    }

    public void addBook(Book book) {
        if (this.getStockCount() < capacity) {
            stockList.add(book);
        }

    }

    public void removeBook(Book book) {
        stockList.remove(book);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
