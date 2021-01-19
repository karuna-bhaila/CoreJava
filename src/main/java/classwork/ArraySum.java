package classwork;

public class ArraySum {
    public static void main(String[] args) {
        int [] intArray = {1, 5, 5, 2, 3};
        int sum = 7;
        boolean isMatch = false;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if(intArray[i] + intArray[j] == sum) {
                    isMatch = true;
                    System.out.println("Index: " + i + " " + j);
                }
            }
        }

        if (!isMatch)
            System.out.println("Matching sum not found!");
    }
}
