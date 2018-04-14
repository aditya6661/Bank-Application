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
import javax.swing.*;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        passwordbox = new javax.swing.JPasswordField();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        l1.setText("Truba BOI Login");
        getContentPane().add(l1);
        l1.setBounds(120, 10, 240, 90);

        l2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l2.setText("User Name");
        getContentPane().add(l2);
        l2.setBounds(30, 110, 130, 20);
        getContentPane().add(t1);
        t1.setBounds(190, 110, 205, 30);

        l3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l3.setText("Password");
        getContentPane().add(l3);
        l3.setBounds(30, 160, 110, 20);
        getContentPane().add(passwordbox);
        passwordbox.setBounds(190, 160, 205, 30);

        btn1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn1.setText("Login");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(140, 210, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/key.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 100, 80);

        setSize(new java.awt.Dimension(440, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
         String path = "jdbc:mysql://localhost/";
        String place = "bankingdb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try
            {
                String q = "Select usertype from create_user where username=? and password=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, t1.getText());
                mystatement.setString(2, passwordbox.getText());
                ResultSet myresult = mystatement.executeQuery();
               if (myresult.next()) 
                {
                    if(myresult.getString("usertype").equals("Admin"))
                    {
                        Menuframe obj=new Menuframe();
                        obj.setVisible(true);
                        this.setVisible(false);
                    }
                    else if(myresult.getString("usertype").equals("Employee"))
                    {
                         Userframe obj=new Userframe();
                         obj.setVisible(true); 
                    }
                     this.setVisible(false);     
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Wrong Username/Password");
                }
                mystatement.execute();
                mystatement.close();
                myconnection.close();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Query" + e.getMessage());
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }
 
    }//GEN-LAST:event_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }

        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
