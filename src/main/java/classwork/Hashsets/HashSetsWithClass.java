package classwork.Hashsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetsWithClass {
    public static void main(String[] args) {
        Book book1 = new Book(101, "CoreJava", 34.23);
        Book book2 = new Book(102, "Unity in Action", 40.00);
        Book book3 = new Book(103, "JS For FrontEnd Engineer", 24.23);

        HashSet<Book> hb = new HashSet<>();

        //no order of insertion
        hb.add(book1);
        hb.add(book2);
        hb.add(book3);

        System.out.println(Arrays.toString(hb.toArray()));

        System.out.println(hb.contains(book1));

        //Iterator
        System.out.println("--Iterator--");
        Iterator<Book> it = hb.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        //Range Access Loop
        System.out.println("--Range Access Loop--");
        for(Book elem:hb)
            System.out.println(elem);
    }
}
