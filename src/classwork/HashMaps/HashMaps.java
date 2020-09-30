package classwork.HashMaps;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "John Doe");
        hm.put(102, "Jane Doe");
        hm.put(103, "James Doe");
        hm.put(104, "Jill Doe");
        hm.put(null, null);
        hm.put(null, "Jake Doe");

        System.out.println(hm.toString());

        System.out.println("\nusing get method");
        System.out.println(hm.get(102));

        System.out.println("\nPrint keys set");
        Set keys = hm.keySet();
        System.out.println(keys);

        System.out.println("\nPrint values set");
        Collection vals = hm.values();
        System.out.println(vals);

        System.out.println("\nSet of mappings in the hashmap");
        Set contents = hm.entrySet();
        System.out.println(contents);

        System.out.println("\nUsing iterator");
        Iterator it = contents.iterator();
        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }

        System.out.println("\nRange access loop");
        for (Map.Entry elem:hm.entrySet())
        {
            Object key = elem.getKey();
            String val = (String)elem.getValue();
            System.out.println(key + ":" + val);
        }

        System.out.println("\nLambda function");
        hm.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
