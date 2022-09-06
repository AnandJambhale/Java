package com.Converter;

import com.Currencies.CurrencyValues;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws SQLException {

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/currencies","root","Hansuja12#");
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("select * from currencies");

        Scanner sc=new Scanner(System.in);

        String country= sc.next();

        double rate=0;

        while (rs.next()){
            String countryName= rs.getString("countryName");

            if (countryName.equals(country)){
                rate=rs.getDouble("exchangeRate");
                break;
            }
        }
        System.out.println(rate*50);
    }

}
