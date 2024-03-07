package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application01 {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));

            String query = prop.getProperty("insertMenu");

            System.out.println("query = " + query);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
