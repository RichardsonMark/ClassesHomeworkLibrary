import java.util.ArrayList;

public class Library {

    private String name;
    private int space;
    private ArrayList<Book> books;

    public Library(String name, int space) {
        this.name = name;
        this.space = space;
        this.books = new ArrayList<>();
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void addABook(Book book) {
        this.books.add(book);
    }
}
