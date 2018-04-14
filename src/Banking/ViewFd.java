
package Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewFd extends javax.swing.JInternalFrame {

    
    public ViewFd() {
        initComponents();

        for (int a = 1; a <= 31; a++) {
            if (a < 10) {
                combobox1.addItem("0" + a);
            } else {
                combobox1.addItem("" + a);
            }
        }
        for (int a = 1; a <= 12; a++) {
            if (a < 10) {
                combobox2.addItem("0" + a);
            } else {
                combobox2.addItem("" + a);
            }
        }
        for (int a = 2012; a <= 2050; a++) {
            combobox3.addItem("" + a);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combobox1 = new javax.swing.JComboBox();
        combobox2 = new javax.swing.JComboBox();
        combobox3 = new javax.swing.JComboBox();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("View FD");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/account.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FD Num", "Acc num", "Mode", "Ruppee", "Period(yr)", "Interest", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 1020, 560);

        combobox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date" }));
        getContentPane().add(combobox1);
        combobox1.setBounds(250, 120, 67, 26);

        combobox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month" }));
        getContentPane().add(combobox2);
        combobox2.setBounds(330, 120, 80, 26);

        combobox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combobox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year" }));
        getContentPane().add(combobox3);
        combobox3.setBounds(430, 120, 76, 26);

        btn1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn1.setText("Show");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(550, 120, 100, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("View FD's");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 30, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/clipboard.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 20, 90, 70);

        setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
   

    String path = "jdbc:mysql://localhost/";
    String place = "bankingdb";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myconnection = DriverManager.getConnection(path + place, "root", "");

        try {
            String str = "select * from fd_info where date='" + combobox3.getSelectedItem() + "-" + combobox2.getSelectedItem() + "-" + combobox1.getSelectedItem() + "'";

            PreparedStatement mystatement = myconnection.prepareStatement(str);
            DefaultTableModel mymodel = (DefaultTableModel) jTable1.getModel();
            String accountno, mode, date, d_w, amount, balance, per;

            ResultSet myresult = mystatement.executeQuery();
            if (myresult.next()) {
                mymodel.setRowCount(0);
                do {
                    accountno = myresult.getString(1);
                    mode = myresult.getString(2);
                    balance = myresult.getString(3);
                    amount = myresult.getString(4);
                    date = myresult.getString(7);
                    per = myresult.getString(5);
                    d_w = myresult.getString(6);

                    mymodel.addRow(new Object[]{accountno, mode, balance, amount, per, d_w, date});

                } while (myresult.next());
            } else {

                JOptionPane.showMessageDialog(rootPane, "No Record Found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Query " + e.getMessage());
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
    }


}//GEN-LAST:event_btn1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JComboBox combobox1;
    private javax.swing.JComboBox combobox2;
    private javax.swing.JComboBox combobox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
