/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

/**
 *
 * @author Samsung
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MasterPage {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(MasterPage.class.getName()).log(Level.SEVERE, null, ex);
        }



        String path = "jdbc:mysql://localhost/";
        String place = "bankingdb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "Select * from create_user";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    Login obj = new Login();
                    obj.setVisible(true);
                } else {
                    CreateAdmin obj = new CreateAdmin();
                    obj.setVisible(true);
                }
            } catch (Exception e) {
                System.out.println("Error in Query" + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error in Connection " + e.getMessage());
        }
    }
}
