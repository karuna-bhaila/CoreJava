package classwork;

public class ArrayRange {
    public static void main(String[] args) {
        int [] intArray = {1, 1, 1, 1};
        int range = 1
                ;
        int match = 0;

        int s_index,
                e_index = intArray.length - range;

        for (s_index = 0; (s_index < range && e_index < intArray.length); s_index++) {
            if (intArray[s_index] == intArray[e_index]) {
                match++;
            }
            e_index++;
        }

        if (match == range)
            System.out.println("Range matches!");
        else
            System.out.println("Range does not match!");
    }
}
