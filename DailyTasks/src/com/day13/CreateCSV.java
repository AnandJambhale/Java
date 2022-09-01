package com.day13;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateCSV {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("D:\\booksTable.csv");

        StringBuilder sb=new StringBuilder();



        sb.append("1");
        sb.append(",");
        sb.append("book name");
        sb.append(",");
        sb.append("book1");
        sb.append("\n");

        sb.append("2");
        sb.append(",");
        sb.append("book name");
        sb.append(",");
        sb.append("book2");
        sb.append("\n");

        sb.append("3");
        sb.append(",");
        sb.append("book name");
        sb.append(",");
        sb.append("book3");
        sb.append("\n");

        pw.write(sb.toString());

        pw.close();
    }
}
