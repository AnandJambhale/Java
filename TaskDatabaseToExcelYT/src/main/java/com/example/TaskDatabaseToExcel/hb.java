package com.example.TaskDatabaseToExcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class hb {
    public static void main(String[] args) throws SQLException, IOException {
        // estabilish connection with database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mapping", "root", "Hansuja12#");
        //query create statement
        Statement st = con.createStatement();
        ResultSet r = st.executeQuery("select * from map");
        //EXCEL
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("mappingData");
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("action");
        row.createCell(2).setCellValue("role");
        row.createCell(3).setCellValue("status ");
        row.createCell(4).setCellValue("authorized");
        row.createCell(5).setCellValue("submitted");
        row.createCell(6).setCellValue("update_record_version");
        row.createCell(7).setCellValue("inactive_previous_record ");
        row.createCell(8).setCellValue("last_configuration_action");
        row.createCell(9).setCellValue("insert_record_into_audit");
        row.createCell(10).setCellValue("insert_record_into_basetable");
        row.createCell(11).setCellValue("mapping_status");
        row.createCell(12).setCellValue("copy_record_from_base_table ");
        int ro = 1;
        while (r.next()) {
            // capturing 1st row data
            int m_id = r.getInt("id");
            String m_action = r.getNString("action");
            String m_role = r.getNString("role");
            String m_status = r.getNString("status");
            String m_authorized = r.getNString("authorized");
            String m_submitted = r.getNString("submitted");
            String m_update_record_version = r.getNString("update_record_version");
            String m_inactive_previous_record = r.getNString("inactive_previous_record");
            String m_last_configuration_action = r.getNString("last_configuration_action");
            String m_insert_record_into_audit = r.getNString("insert_record_into_audit");
            String m_insert_record_into_basetable = r.getNString("insert_record_into_basetable");
            String m_mapping_status = r.getNString("mapping_status");
            String m_copy_record_from_base_table = r.getNString("copy_record_from_base_table");
            //create new  row in excel sheet
            XSSFRow row1 = sheet.createRow(ro++);
            // create cells
            row1.createCell(0).setCellValue(m_id);
            row1.createCell(1).setCellValue(m_action);
            row1.createCell(2).setCellValue(m_role);
            row1.createCell(3).setCellValue(m_status);
            row1.createCell(4).setCellValue(m_authorized);
            row1.createCell(5).setCellValue(m_submitted);
            row1.createCell(6).setCellValue(m_update_record_version);
            row1.createCell(7).setCellValue(m_inactive_previous_record);
            row1.createCell(8).setCellValue(m_last_configuration_action);
            row1.createCell(9).setCellValue(m_insert_record_into_audit);
            row1.createCell(10).setCellValue(m_insert_record_into_basetable);
            row1.createCell(11).setCellValue(m_mapping_status);
            row1.createCell(12).setCellValue(m_copy_record_from_base_table);

        }
        FileOutputStream fos = new FileOutputStream("D:\\mapping_datafile.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();
        System.out.println("all done");
    }
}
