package assignment;

import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList mixedList = new ArrayList<>();

        names.add("John Doe");
        names.add("Jane Doe");

        mixedList.add(1);
        mixedList.add("One");

        System.out.println(names.toString());
        System.out.println(mixedList.toString());

        ArrayList finalList = new ArrayList();
        finalList.add(names);
        finalList.add(mixedList);

        System.out.println(finalList.toString());
    }
}
