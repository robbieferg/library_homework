import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stockList;

    public Library() {
        stockList = new ArrayList<Book>();
    }

    public int getStockCount() {
        return stockList.size();
    }

    public void addBook(Book book) {
        stockList.add(book);
    }
}
