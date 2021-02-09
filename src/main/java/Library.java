import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }


    public int getCapacity(){
        return this.capacity;
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public boolean checkCapacity(){
        if (this.getCollectionSize() < this.capacity) {
            return true;
        }
        return false;
    }

    public void addBook(Book book) {
        if (this.checkCapacity() == true) {
            this.collection.add(book);
        }

    }

    public void removeBook(Book book){
        this.collection.remove(book);
    }


}
