
package Banking;


import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class DepositBalance extends javax.swing.JInternalFrame {

    /**
     * Creates new form DepositForm
     */
    public DepositBalance() {
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

        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        l6 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Deposit Form");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/account.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        l2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l2.setText("Enter Account No.");
        getContentPane().add(l2);
        l2.setBounds(200, 280, 220, 27);

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(510, 270, 230, 30);

        l4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l4.setText("Old Balance");
        getContentPane().add(l4);
        l4.setBounds(200, 390, 180, 30);

        l3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l3.setText("Mode");
        getContentPane().add(l3);
        l3.setBounds(200, 460, 170, 30);

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(510, 530, 230, 30);

        btn2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn2.setText("Update");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(440, 630, 140, 30);

        l5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l5);
        l5.setBounds(510, 390, 230, 30);

        l7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l7.setText(" Date");
        getContentPane().add(l7);
        l7.setBounds(200, 210, 130, 30);

        l8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l8);
        l8.setBounds(510, 210, 230, 30);

        btn1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn1.setText("Details");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(790, 270, 140, 30);

        l6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l6.setText("Deposit Amount");
        getContentPane().add(l6);
        l6.setBounds(200, 530, 210, 30);

        combobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Check", "Draft" }));
        getContentPane().add(combobox);
        combobox.setBounds(510, 460, 230, 30);

        l9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l9);
        l9.setBounds(510, 330, 230, 30);

        l10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l10.setText("Name");
        getContentPane().add(l10);
        l10.setBounds(200, 320, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/piggy-bank.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 60, 90, 70);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Deposit Form");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 80, 200, 30);

        setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String path = "jdbc:mysql://localhost/";
        String place = "bankingdb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "Update customer_info set balance=? where accountno=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                int bal = Integer.parseInt(l5.getText()) + Integer.parseInt(t2.getText());
                mystatement.setString(1, String.valueOf(bal));
                mystatement.setString(2, t1.getText());
                mystatement.execute();

            } catch (Exception e) {
                // JOptionPane.showMessageDialog(rootPane, "Error in Query" + e.getMessage());  
            }
            try {
                String q = "insert into transaction(accountno,mode,balance,amount,date,d_w) values(?,?,?,?,?,?)";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, t1.getText());
                mystatement.setString(2, combobox.getSelectedItem().toString());
                mystatement.setString(3, l5.getText());
                mystatement.setString(4, t2.getText());
                mystatement.setString(5, l8.getText());
                mystatement.setString(6, "Deposit");
                mystatement.execute();

                JOptionPane.showMessageDialog(rootPane, "Balance Sheet Updated Succesfully.");

                t1.setText(null);
                combobox.setSelectedIndex(0);
                l5.setText(null);
                l9.setText(null);
                t2.setText(null);
        
                mystatement.close();
                myconnection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error in Query" + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection" + e.getMessage());
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        java.util.Date obj = new java.util.Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String currentdate = dateformat.format(obj);
        l8.setText(currentdate);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String path = "jdbc:mysql://localhost/";
        String place = "bankingdb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "Select * from customer_info where accountno=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, t1.getText());
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    l5.setText(myresult.getString("balance"));
                    l9.setText(myresult.getString("name"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error in Query" + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection" + e.getMessage());
        }





    }//GEN-LAST:event_btn1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}