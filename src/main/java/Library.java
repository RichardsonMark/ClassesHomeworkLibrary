import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreCounter;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genreCounter = new HashMap<>();
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void addABook(Book book) {
        if (books.size() < this.capacity){
            this.books.add(book);
            increaseGenreCounter(book.getGenre());
        }
    }

    public Book loanABook(Book book) {
        int bookIndex = this.books.indexOf(book);
        if (bookIndex >= 0) {
            return this.books.remove(bookIndex);
        } else {
            return null;
        }

    }

    public HashMap<String, Integer> getGenreMap() {
        return this.genreCounter;
    }

    public void increaseGenreCounter(String genre) {
        Integer genreCount = genreCounter.get(genre);
        if (genreCount == null){
            genreCount = 0;
        }
        genreCounter.put(genre, genreCount + 1);
        }
}
