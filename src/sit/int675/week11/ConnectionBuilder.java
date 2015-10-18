/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Student Lab
 */
public class ConnectionBuilder {

    private static boolean load = false;
    public final static String URL = "jdbc:derby://localhost:1527/sample";
    public final static String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public final static String USER_NAME = "app";
    public final static String PASSWORD = "app";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            if (!load) {
                Class.forName(DRIVER);
                load = true;
            }
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement stm = conn.createStatement();
            conn.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return conn;
    }
}
