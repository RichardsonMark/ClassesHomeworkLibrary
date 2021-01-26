import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> tsundoku;

    public Borrower(String name){
        this.name = name;
        this.tsundoku = new ArrayList<>();
    }

    public int getCollectionCount(){
        return this.tsundoku.size();
    }

    public void addBookToCollection(Book book){
        this.tsundoku.add(book);
    }

    public Book removeBookFromCollection(){
        return tsundoku.remove(0);
    }
}
