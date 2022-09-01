package com.day13;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class printer {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\booksTable.csv");
        FileInputStream fis=new FileInputStream(file);

        HSSFWorkbook workbook=new HSSFWorkbook(fis);

        HSSFSheet sheet= workbook.getSheetAt(0);

        Iterator<Row> iterator=sheet.iterator();

//        sc.useDelimiter("|");
        while (iterator.hasNext()){
            System.out.println(iterator.next().cellIterator());
        }
    }
}
