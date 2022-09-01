package com.example.TaskDatabaseToExcel;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class task2 {
    public static void main(String[] args) {

        try {
            PrintWriter pw= new PrintWriter(new File("D:\\mab.csv"));
            PrintWriter pw1= new PrintWriter(new File("C:\\Users\\lenovo\\Downloads\\mab.csv"));
            StringBuilder sb=new StringBuilder();


            Connection connection=null;
            DB_Connection obj_DB_Connection=new DB_Connection();
            connection=obj_DB_Connection.getConnection();
            ResultSet rs=null;

            String query="select * from map";
            PreparedStatement ps=connection.prepareStatement(query);
            rs=ps.executeQuery();

            sb.append("id");
            sb.append("|");
            sb.append("action");
            sb.append("|");
            sb.append("role");
            sb.append("|");
            sb.append("status");
            sb.append("|");
            sb.append("authorized");
            sb.append("|");
            sb.append("submitted");
            sb.append("|");
            sb.append("update_record_version");
            sb.append("|");
            sb.append("inactive_previous_record");
            sb.append("|");
            sb.append("last_configuration_action");
            sb.append("|");
            sb.append("insert_record_into_audit");
            sb.append("|");
            sb.append("insert_record_into_basetable");
            sb.append("|");
            sb.append("mapping_status");
            sb.append("|");
            sb.append("copy_record_from_base_table");
            sb.append("\r\n");

            while(rs.next()){
                sb.append(rs.getString("id"));
                sb.append("|");
                sb.append(rs.getString("action"));
                sb.append("|");
                sb.append(rs.getString("role"));
                sb.append("|");
                sb.append(rs.getString("status"));
                sb.append("|");
                sb.append(rs.getString("authorized"));
                sb.append("|");
                sb.append(rs.getString("submitted"));
                sb.append("|");
                sb.append(rs.getString("update_record_version"));
                sb.append("|");
                sb.append(rs.getString("inactive_previous_record"));
                sb.append("|");
                sb.append(rs.getString("last_configuration_action"));
                sb.append("|");
                sb.append(rs.getString("insert_record_into_audit"));
                sb.append("|");
                sb.append(rs.getString("insert_record_into_basetable"));
                sb.append("|");
                sb.append(rs.getString("mapping_status"));
                sb.append("|");
                sb.append(rs.getString("copy_record_from_base_table"));
                sb.append("\r\n");
            }

            pw.write(sb.toString());
            pw1.write(sb.toString());
            pw.close();
            pw1.close();
            System.out.println("finished");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}