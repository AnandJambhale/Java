package com.example.TaskDatabaseToExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Runner {

    // Step1: Main driver method
    public static void main(String[] args) throws IOException {
        // Step 2: Making connection using
        // Connection type and inbuilt function on
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet
                = workbook.createSheet(" Mapping ");

        XSSFRow row;

        Map<Integer, Object[]> Data
                = new TreeMap<Integer, Object[]>();

        con = connection.connectDB();

        try {

            // SQL command data stored in String datatype
            String sql = "select * from map";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();

            Data.put(0, new Object[] { "action","role","status","authorized","submitted","update_record_version","inactive_previous_record","last_configuration_action","insert_record_into_audit","insert_record_into_basetable","mapping_status","copy_record_from_base_table"});

            while (rs.next()) {

                int id = rs.getInt("id");
                String action = rs.getString("action");
                String role = rs.getString("role");
                String status = rs.getString("status");
                String authorized = rs.getString("authorized");
                String submitted = rs.getString("submitted");
                String update_record_version = rs.getString("update_record_version");
                String inactive_previous_record = rs.getString("inactive_previous_record");
                String last_configuration_action=rs.getString("last_configuration_action");
                String insert_record_into_audit=rs.getString("insert_record_into_audit");
                String insert_record_into_basetable=rs.getString("insert_record_into_basetable");
                String mapping_status=rs.getString("mapping_status");
                String copy_record_from_base_table=rs.getString("copy_record_from_base_table");
                Data.put(
                        id,
                        new Object[] { action,role,status,authorized,submitted,update_record_version,inactive_previous_record,last_configuration_action,insert_record_into_audit,insert_record_into_basetable,mapping_status,copy_record_from_base_table});
            }
        }

        // Catch block to handle exception
        catch (SQLException e) {

            // Print exception pop-up on screen
            System.out.println(e);
        }

        Set<Integer> keyid = Data.keySet();

        int rowid = 0;

        // writing the data into the sheets...

        for (Integer key : keyid) {

            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = Data.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }

        // writing the workbook into the file...
        File file=new File("D:/Mapped.xlsx");
        FileOutputStream out = new FileOutputStream(file);
        System.out.println("File has been saved to "+file);
        workbook.write(out);
        out.close();
    }
}

