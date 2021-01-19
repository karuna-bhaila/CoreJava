package classwork;

public class Typecasting
{
    public static void main(String[] args) {
        byte b = 100;
        int i = b;
        System.out.println(i);

        short s = 500;
        b = (byte) s;
        System.out.println(b);

        int j = 0;
        for (int x = 0; x <100; x++)
            j = j++;
        System.out.println(j);
    }
}
