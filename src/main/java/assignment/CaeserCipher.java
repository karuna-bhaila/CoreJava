package assignment;

import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message,
                codedMessage;
        char[] code = new char[100];

        //The quick brown fox jumps over the lazy dog!!!123@
        //Encryption
        System.out.print("Enter your message: ");
        message = sc.nextLine();

        for (int i = 0; i < message.length(); i++)
        {
            code[i] = message.charAt(i);

            if (code[i] == 'z')
                code[i] = 'a';
            else if (code[i] == 'Z')
                code[i] = 'A';
            else if (Character.isLetter(code[i]))
                code[i] = ++code[i];
        }

        System.out.print("The coded message is: ");
        for (char elem : code)
            System.out.print(elem);

        //Decryption
        System.out.print("\n\nEnter your coded message: ");
        codedMessage = sc.nextLine();

        for (int i = 0; i < codedMessage.length(); i++)
        {
            code[i] = codedMessage.charAt(i);

            if (code[i] == 'a')
                code[i] = 'z';
            else if (code[i] == 'A')
                code[i] = 'Z';
            else if (Character.isLetter(code[i]))
                code[i] = --code[i];
        }

        System.out.print("The decoded message is: ");
        for (char elem : code)
            System.out.print(elem);
    }
//    char c1 = 0;
//    char c2 = '\u0000', c3 = '\u0E00'; //unicode character
//    char c4 = 65535;
//    char c5 = 65536;
}
