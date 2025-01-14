/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import dao.ConnectionProvider;
import java.awt.Color;
import javax.swing.table.*;

/**
 *
 * @author gurdeepsingh
 */
public class ManageUser extends javax.swing.JFrame {
    
    int appUserPk = 0;

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().equals("") && !txtName.getText().equals("") && !txtEmail.getText().equals("") && !txtMobileNo.getText().equals("") && !txtAddress.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !txtName.getText().equals("") && !txtName.getText().equals("") && !txtEmail.getText().equals("") && !txtMobileNo.getText().equals("") && !txtAddress.getText().equals("") && !txtPassword.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        statusOption = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Manage Users");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 0, -1, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile No.", "Email", "Address", "Status"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, -1, 511));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 58, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 81, 379, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Mobile No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 116, -1, -1));
        getContentPane().add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 139, 380, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 180, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 203, 380, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 244, -1, -1));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 267, 380, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 308, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 331, 380, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 372, -1, -1));

        saveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 436, -1, -1));

        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 436, -1, -1));

        resetButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 436, -1, -1));

        closeButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 436, -1, -1));

        statusOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        statusOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusOptionMouseClicked(evt);
            }
        });
        statusOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusOptionActionPerformed(evt);
            }
        });
        getContentPane().add(statusOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 395, 155, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All_page_Background.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM appuser WHERE userRole='Admin'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("appuser_pk"), rs.getString("name"), rs.getString("mobileNumber"), rs.getString("email"), rs.getString("address"), rs.getString("status")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateButton.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

// txtName handling code here:
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

// txtEmail handling code here:
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

// txtPassword handling code here:
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

// saveButton handling code here:
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name = txtName.getText();
        String mobileNo = txtMobileNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String password = txtPassword.getText();
        String status = (String) statusOption.getSelectedItem();
        
        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required! ");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                String sql = "INSERT INTO appuser (userRole, name, mobileNumber, email, password, address, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, "Admin");
                ps.setString(2, name);
                ps.setString(3, mobileNo);
                ps.setString(4, email);
                ps.setString(5, password);
                ps.setString(6, address);
                ps.setString(7, status);
                
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "User added successfully");
                    setVisible(false); // Hide current window
                    new ManageUser().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to add user");
                }
                ps.close();
                con.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                e.printStackTrace();
                
            }
            
        }
        

    }//GEN-LAST:event_saveButtonActionPerformed

// updateButton handling code here:
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String name = txtName.getText();
        String mobileNo = txtMobileNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String status = (String) statusOption.getSelectedItem();
        
        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required! ");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                String sql = "UPDATE appuser set name=?,mobileNumber=?,email=?,address=?,status=? where appuser_pk=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, mobileNo);
                ps.setString(3, email);
                ps.setString(4, address);
                ps.setString(5, status);
                ps.setInt(6, appUserPk);
                
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "User information updated successfully");
                    setVisible(false); // Hide current window
                    new ManageUser().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update user information");
                }
                ps.close();
                con.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                e.printStackTrace();
                
            }
            
        }
        

    }//GEN-LAST:event_updateButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        
    }//GEN-LAST:event_closeButtonActionPerformed

    //  Populating form withrow data when clicked:
    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int index = userTable.getSelectedRow();
        TableModel model = userTable.getModel();
        
        if (index != -1) { // Check if a valid row is selected
            // Get data from the selected row
            String id = model.getValueAt(index, 0).toString();
            appUserPk = Integer.parseInt(id);
            
            String name = model.getValueAt(index, 1).toString();
            String mobileNo = model.getValueAt(index, 2).toString();
            String email = model.getValueAt(index, 3).toString();
            String address = model.getValueAt(index, 4).toString();
            String status = model.getValueAt(index, 5).toString();

            // Update text fields with row data
            txtName.setText(name);
            txtMobileNo.setText(mobileNo);
            txtEmail.setText(email);
            txtAddress.setText(address);
            
            statusOption.removeAllItems();
            if (status.equals("Active")) {
                statusOption.addItem("Active");
                statusOption.addItem("Inactive");
            } else {
                statusOption.addItem("Inactive");
                statusOption.addItem("Active");
                
            }
            
            txtPassword.setEditable(false);
            txtPassword.setBackground(Color.GRAY);
            saveButton.setEnabled(false);
            updateButton.setEnabled(true);
        }

    }//GEN-LAST:event_userTableMouseClicked

    private void statusOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusOptionActionPerformed
        // TODO add your handling code here:
        evt.getID();

    }//GEN-LAST:event_statusOptionActionPerformed

    private void statusOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusOptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_statusOptionMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageUser().setVisible(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> statusOption;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
