package classwork.Exception;

public class MyOwnNumberFormatException extends Exception{
    public MyOwnNumberFormatException(){
        System.out.print("Error! Age must be an integer.\n");
    }
}
