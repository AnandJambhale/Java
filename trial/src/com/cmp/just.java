package com.cmp;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class just {
    public static void main(String args[]) throws Exception {
        File input = new File("MyTextFile.txt");
        File temp = new File("temp.txt");
        Scanner sc = new Scanner(input);    //Reads from input
        PrintWriter pw = new PrintWriter(temp); //Writes to temp file

        //Grab and change the int
        int i = sc.nextInt();
        i = 42;

        //Print the int and the rest of the orginal file into the temp
        pw.print(i);
        while(sc.hasNextLine())
            pw.println(sc.nextLine());

        sc.close();
        pw.close();

        //Delete orginal file and rename the temp to the orginal file name
        input.delete();
        temp.renameTo(input);
    }
}

