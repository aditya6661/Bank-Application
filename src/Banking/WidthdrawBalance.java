
package Banking;


import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class WidthdrawBalance extends javax.swing.JInternalFrame {

   
    public WidthdrawBalance() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        l8 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox();
        l7 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Debit");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/account.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 768));
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

        l6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l6.setText("Debit Amount");
        getContentPane().add(l6);
        l6.setBounds(180, 490, 170, 30);

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(530, 490, 270, 30);

        btn2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn2.setText("Update");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(400, 590, 170, 32);

        l8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l8);
        l8.setBounds(530, 200, 270, 28);

        l3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l3.setText("Mode");
        getContentPane().add(l3);
        l3.setBounds(180, 430, 160, 30);

        combobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Check", "Draft" }));
        getContentPane().add(combobox);
        combobox.setBounds(530, 430, 270, 30);

        l7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l7.setText(" Date");
        getContentPane().add(l7);
        l7.setBounds(180, 200, 120, 30);

        l9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l9.setText("Enter Account No.");
        getContentPane().add(l9);
        l9.setBounds(180, 260, 200, 27);

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(530, 260, 270, 30);

        l10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l10.setText("Old Balance");
        getContentPane().add(l10);
        l10.setBounds(180, 370, 170, 30);

        l11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l11);
        l11.setBounds(530, 370, 270, 30);

        btn3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn3.setText("Details");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(840, 260, 160, 30);

        l12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l12);
        l12.setBounds(530, 310, 270, 30);

        l13.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l13.setText("Name");
        getContentPane().add(l13);
        l13.setBounds(180, 310, 170, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Withdraw Money");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 50, 230, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/cash-machine.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 50, 70, 70);

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

                int bal = Integer.parseInt(l11.getText()) - Integer.parseInt(t2.getText());
                if (bal < 0) {

                    JOptionPane.showMessageDialog(rootPane, "Debit Amount more than Balance amount");

                } else {
                    String q = "Update customer_info set balance=? where accountno=?";
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(1, String.valueOf(bal));
                    mystatement.setString(2, t3.getText());
                    mystatement.executeUpdate();


                    try {
                        String q1 = "insert into transaction(accountno,mode,balance,amount,date,d_w) values(?,?,?,?,?,?)";
                        PreparedStatement mystatement1 = myconnection.prepareStatement(q1);
                        mystatement1.setString(1, t3.getText());
                        mystatement1.setString(2, combobox.getSelectedItem().toString());
                        mystatement1.setString(3, l11.getText());
                        mystatement1.setString(4, t2.getText());
                        mystatement1.setString(5, l8.getText());
                        mystatement1.setString(6, "Debit");
                        int x = mystatement1.executeUpdate();
                        if (x > 0) {
                            JOptionPane.showMessageDialog(rootPane, "Balance Sheet Updated Succesfully.");
                        }
                        t3.setText(null);
                        combobox.setSelectedIndex(0);
                        l12.setText(null);
                        t2.setText(null);
                    
                        l11.setText(null);
                        mystatement.close();
                        myconnection.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Error in Query trac" + e.getMessage());
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error in cust " + e.getMessage());
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

private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    
    String path = "jdbc:mysql://localhost/";
    String place = "bankingdb";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myconnection = DriverManager.getConnection(path + place, "root", "");
        try {
            String q = "Select * from customer_info where accountno=?";
            PreparedStatement mystatement = myconnection.prepareStatement(q);
            mystatement.setString(1, t3.getText());
            ResultSet myresult = mystatement.executeQuery();
            if (myresult.next()) {
                l11.setText(myresult.getString("balance"));
                l12.setText(myresult.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Query" + e.getMessage());
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error in Connection" + e.getMessage());
    }




}//GEN-LAST:event_btn3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JComboBox combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
