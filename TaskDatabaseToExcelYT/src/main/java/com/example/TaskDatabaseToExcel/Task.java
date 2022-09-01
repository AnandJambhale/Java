package com.example.TaskDatabaseToExcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class Task {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mapping","root","Hansuja12#");

        Statement stmt= con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from map");

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet();

        XSSFRow row=sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("action");
        row.createCell(2).setCellValue("role");
        row.createCell(3).setCellValue("status");
        row.createCell(4).setCellValue("authorzed");
        row.createCell(5).setCellValue("submitted");
        row.createCell(6).setCellValue("update_record_version");
        row.createCell(7).setCellValue("inactive_configuration_action");
        row.createCell(8).setCellValue("insert_into_audit");
        row.createCell(9).setCellValue("insert_into_database");
        row.createCell(10).setCellValue("mapping_status");
        row.createCell(11).setCellValue("copy_record_from_base_table");

        int r=0;
        while (rs.next()){
            int id=rs.getInt("id");
            String action= rs.getString("action");
            String role= rs.getString("role");
            String status= rs.getString("authorized");
            String authorized=rs.getString("authorized");
            String submitted=rs.getString("submitted");
            String update_record_version= rs.getString("update_record_version");
            String inactive_previous_record=rs.getString("inactive_previous_record");
            String insert_record_into_audit=rs.getString("insert_record_into_audit");
            String insert_record_into_basetable=rs.getString("insert_record_into_basetable");
            String mapping_status=rs.getString("mapping_status");
            String copy_record_from_base_table=rs.getString("copy_record_from_base_table");

            row= sheet.createRow(r++);

            row.createCell(0).setCellValue(id);
            row.createCell(1).setCellValue(action);
            row.createCell(2).setCellValue(role);
            row.createCell(3).setCellValue(status);
            row.createCell(4).setCellValue(authorized);
            row.createCell(5).setCellValue(submitted);
            row.createCell(6).setCellValue(update_record_version);
            row.createCell(7).setCellValue(inactive_previous_record);
            row.createCell(8).setCellValue(insert_record_into_audit);
            row.createCell(9).setCellValue(insert_record_into_basetable);
            row.createCell(10).setCellValue(mapping_status);
            row.createCell(11).setCellValue(copy_record_from_base_table);
        }

        FileOutputStream fos=new FileOutputStream("D:\\map.xlsx");
        workbook.write(fos);

        workbook.close();
        fos.close();
    }
}
