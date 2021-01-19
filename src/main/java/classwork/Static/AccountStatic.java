package classwork.Static;

public class AccountStatic {
    byte id = 34;
    //static variables: only one variable is created and exists or all class instances
    static String name = "Checking";
    static float balance = 1000.50f;

    static
    {
        System.out.println("Static block called");
        getAccountInfo();
    }

    {
        //This is called everytime object is created.
        System.out.println("Instance block called");
    }

    public static void getAccountInfo()
    {
        System.out.println(name + " " + balance);
        //cannot display id as it is a non-static variable
    }

}

