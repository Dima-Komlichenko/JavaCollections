import entities.Book;
import entities.Person;

import java.util.Arrays;

public class MyHomeLib implements Runnable {
    @Override
    public void run() {
        try {
            work();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private void work() throws Exception {
        Person bulgakov = new Person("Bulgakov");
        Book[] books = new Book[2];
        books[0] = new Book("The Master and Margarita", new Person("Bulgakov"));
        books[1] = new Book("Dog's heart", books[0].getAuthor());

        print("-----------", books);
        bulgakov.setName("Misha Bulgakov");

        print("Change ----------------", books);

        bulgakov = null;

        print("Delete (null) ----------", books);

        System.gc();
        print("GC -----------", books);

        books[0].getAuthor().setName("Afanasevich");

        System.gc();
        print("GC -----------", books);

    }

    private void print(String msg, Book[] books) {
        System.out.println(msg);
        for (int i = 0; i < 2; i++) {
            System.out.println(books[i]);
        }
    }

}
