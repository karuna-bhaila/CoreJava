package classwork.FileHandling;

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class WriteToFile {
    public static void main(String[] args) {
        //Creating fileWriter & writing to a file
        //File is created in the same directory as the src folder
        System.out.println("Writing to file-------------------------");
        FileWriter fw = null;
        try {
            fw = new FileWriter("textFile.txt");
            //if append is not true, file is overwritten
            fw.write("Hello World!\n");
            fw.write("This is a text file created in java.\n");
            fw.close();
            System.out.println("Write to file successful!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Writing to a file
        /*PrintWriter out = new PrintWriter(new BufferedWriter(fw));
        out.println("Hello World!");
        out.println("This is a text file created in java.");
        out.close();*/

        //Reading from file
        System.out.println("Reading from file----------------------------");
        Path filepath = Paths.get("textFile.txt");
        File myFile = filepath.toFile();
        String fileData;

        try {
            Scanner fr = new Scanner(myFile);
            while(fr.hasNextLine()) {
                fileData = fr.nextLine();
                System.out.println(fileData);
            }
            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        //appending to file
        System.out.println("Appending to file----------------------------");
        try {
            fw = new FileWriter("textFile.txt", true);
            fw.write("This line was appended to this file.\n");
            fw.close();
            System.out.println("Write to file successful!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading from file
        try {
            Scanner fr = new Scanner(myFile);
            while(fr.hasNextLine()) {
                fileData = fr.nextLine();
                System.out.println(fileData);
            }
            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
