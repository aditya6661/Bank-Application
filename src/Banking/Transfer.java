
package Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class Transfer extends javax.swing.JInternalFrame {

    
    public Transfer() {
        initComponents();

        java.util.Date obj = new java.util.Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String currentdate = dateformat.format(obj);
        l3.setText(currentdate);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sourceaccbox = new javax.swing.JTextField();
        accounthldrbox = new javax.swing.JTextField();
        curentbox = new javax.swing.JTextField();
        destinationaccbox = new javax.swing.JTextField();
        amountbox = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Money Transfer");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/account.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 330, 240, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("From Account no");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 280, 250, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Destination Account");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 430, 270, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 480, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rs/-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(700, 490, 40, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setText("Show Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 280, 220, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("Current Amount");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 380, 190, 30);

        sourceaccbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(sourceaccbox);
        sourceaccbox.setBounds(460, 280, 230, 30);

        accounthldrbox.setEditable(false);
        accounthldrbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(accounthldrbox);
        accounthldrbox.setBounds(460, 340, 230, 30);

        curentbox.setEditable(false);
        curentbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(curentbox);
        curentbox.setBounds(460, 390, 230, 30);

        destinationaccbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(destinationaccbox);
        destinationaccbox.setBounds(460, 440, 230, 30);

        amountbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(amountbox);
        amountbox.setBounds(460, 490, 230, 30);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setText("Transfer Amount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 610, 380, 30);

        l2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        l2.setText("Date");
        getContentPane().add(l2);
        l2.setBounds(150, 220, 160, 30);

        l3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(l3);
        l3.setBounds(460, 220, 230, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Money Transfer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 60, 220, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/insert-coin.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 60, 100, 80);

        setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String path = "jdbc:mysql://localhost/";
    String place = "bankingdb";
    try {
        Connection myconnection = DriverManager.getConnection(path + place, "root", "");
        PreparedStatement mystatement = null;
        try {
            String q = "select * from customer_info where accountno=?";
            mystatement = myconnection.prepareStatement(q);
            mystatement.setString(1, sourceaccbox.getText());
            ResultSet myresult = mystatement.executeQuery();
            if (myresult.next()) {
                accounthldrbox.setText(myresult.getString("name"));
                curentbox.setText(myresult.getString("balance"));

            } else {
                JOptionPane.showMessageDialog(rootPane, "no record found");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in query" + e.getMessage());
        } finally {
            mystatement.close();
            myconnection.close();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error in connection" + e.getMessage());

    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


    String path = "jdbc:mysql://localhost/";
    String place = "bankingdb";
    try {
        Connection myconnection = DriverManager.getConnection(path + place, "root", "");
        PreparedStatement mystatement = null;
        double crnt1 = 0, crnt2 = 0;
        crnt1 = Double.parseDouble(curentbox.getText());

        try {


            String q = "select balance from customer_info where accountno=?";
            mystatement = myconnection.prepareStatement(q);
            mystatement.setString(1, destinationaccbox.getText());
            ResultSet set = mystatement.executeQuery();
            if (set.next()) {
                crnt2 = Double.parseDouble(set.getString(1));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Destination Account Not Found");

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in query" + e.getMessage());
        }

        double amnt = Double.parseDouble(amountbox.getText());

        if (crnt2 != 0) {
            if (crnt1 < amnt) {
                JOptionPane.showMessageDialog(rootPane, "Transfer not possible");
            } else {


                try {


                    String q = "update customer_info set balance=? where accountno=?";
                    mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(2, sourceaccbox.getText());

                    double sum = crnt1 - amnt;
                    mystatement.setString(1, "" + sum);

                    mystatement.executeUpdate();
                    //JOptionPane.showMessageDialog(rootPane, "deposited successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Error in query" + e.getMessage());
                }


                try {


                    String q = "update customer_info set balance=? where accountno=?";
                    mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(2, destinationaccbox.getText());

                    double sum = crnt2 + amnt;
                    mystatement.setString(1, "" + sum);

                    mystatement.executeUpdate();
                    //JOptionPane.showMessageDialog(rootPane, "Transfered successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Error in query" + e.getMessage());
                }



                try {


                    String q = "insert into transfer(src,dest,amount,date) value(?,?,?,?) ";
                    mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(1, sourceaccbox.getText());
                    mystatement.setString(2, destinationaccbox.getText());
                    mystatement.setString(3, amountbox.getText());
                    mystatement.setString(4, l3.getText());

                    mystatement.execute();




                    String qd = "insert into transaction(accountno,mode,balance,amount,date,d_w) values(?,?,?,?,?,?)";
                    PreparedStatement mystatementd = myconnection.prepareStatement(qd);
                    mystatementd.setString(1, sourceaccbox.getText());
                    mystatementd.setString(2, "Transfer");
                    mystatementd.setString(3, curentbox.getText());
                    mystatementd.setString(4, amountbox.getText());
                    mystatementd.setString(5, l3.getText());
                    mystatementd.setString(6, "Debit");
                    mystatementd.execute();


                    String dq = "insert into transaction(accountno,mode,balance,amount,date,d_w) values(?,?,?,?,?,?)";
                    PreparedStatement dmystatement = myconnection.prepareStatement(dq);
                    dmystatement.setString(1, destinationaccbox.getText());
                    dmystatement.setString(2, "Transfer");
                    dmystatement.setString(3, crnt2 + "");
                    dmystatement.setString(4, amountbox.getText());
                    dmystatement.setString(5, l3.getText());
                    dmystatement.setString(6, "Deposit");
                    dmystatement.execute();




                    destinationaccbox.setText(null);
                    amountbox.setText(null);
                    accounthldrbox.setText(null);
                    curentbox.setText(null);
                    JOptionPane.showMessageDialog(rootPane, "Transfered successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Error in query" + e.getMessage());
                }

            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error in connection" + e.getMessage());

    }


}//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accounthldrbox;
    private javax.swing.JTextField amountbox;
    private javax.swing.JTextField curentbox;
    private javax.swing.JTextField destinationaccbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField sourceaccbox;
    // End of variables declaration//GEN-END:variables
}
