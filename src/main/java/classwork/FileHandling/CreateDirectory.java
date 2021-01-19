package classwork.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("E:\\Java\\CoreJava\\src\\classwork\\FileHandling");

        if (!dir.exists()) {
            System.out.println("Creating directory " + dir.getName());
            boolean result = false;
            try {
                dir.mkdir();
                result = true;
            } catch (Exception e) {
            }
            if (result)
                System.out.println("Directory created.");
        }
        createFile(dir);
    }

    private static void createFile(File dir) {
        String path = dir.getAbsolutePath() + "\\TextFile.txt";
        File file = new File(path);

        try {
            file.createNewFile();
            System.out.println("File created.");
        } catch (IOException e) {
            System.out.println("Could not create file!");
            e.printStackTrace();
        }
    }
}
