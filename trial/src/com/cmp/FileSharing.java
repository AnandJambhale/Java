package com.cmp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSharing {
    public static void main(String[] args) {
        File myFile = new File("trial.txt");
        try {
            myFile.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            FileWriter myWriter = new FileWriter("trial.txt",true);
            myWriter.append(str+"\n");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

