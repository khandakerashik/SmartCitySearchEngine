/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ashik
 */
public class AddAdmin extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form AddAdmin
     */
    public AddAdmin() {
       super("Create Admin");
        initComponents();
        conn= SQLiteJDBCDriverConnection.ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        securityqLabel = new javax.swing.JLabel();
        securityaLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        nameField = new javax.swing.JTextField();
        securityQuestionCombo = new javax.swing.JComboBox<>();
        securityanswerField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        usernameLabel.setText("Username");

        nameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nameLabel.setText("Name");

        passwordLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        securityqLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        securityqLabel.setText("Security Question");

        securityaLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        securityaLabel.setText("Answer");

        usernameField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        passwordField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        nameField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        securityQuestionCombo.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N
        securityQuestionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your first phone number?", "What is your nickname?", "What is your fathers name?", "What is your phone numbers last 4 digits?", "What is your favorite place?" }));
        securityQuestionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestionComboActionPerformed(evt);
            }
        });

        securityanswerField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        createButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 51, 204));
        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Arrow-Download-icon24.png"))); // NOI18N
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 51));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Arrow-Back-icon.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        typeLabel.setText("Type");

        typeCombo.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moderator", "Admin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(nameLabel)
                            .addComponent(passwordLabel))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField)
                            .addComponent(nameField)
                            .addComponent(passwordField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(securityqLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(securityaLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(securityQuestionCombo, 0, 341, Short.MAX_VALUE)
                            .addComponent(securityanswerField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createButton))
                            .addComponent(typeCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityQuestionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityqLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityanswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityaLabel))
                .addGap(18, 18, 18)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Admin ob=new Admin();
        ob.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        try{
            String sql="Insert into Account (Username,Name,Password,Type,Sec_Q,Answer)values (?,?,?,?,?,?)";
       pst=conn.prepareStatement(sql);
       pst.setString(1,usernameField.getText());
       pst.setString(2,nameField.getText());
       pst.setString(3,passwordField.getText());
       pst.setString(4,(String)typeCombo.getSelectedItem());
       pst.setString(5,(String)securityQuestionCombo.getSelectedItem() );
       pst.setString(6,securityanswerField.getText());
       pst.execute();
       JOptionPane.showMessageDialog(null, "New account has been created for these informations. \nThank You!.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }//GEN-LAST:event_createButtonActionPerformed

    private void securityQuestionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestionComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestionComboActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> securityQuestionCombo;
    private javax.swing.JLabel securityaLabel;
    private javax.swing.JTextField securityanswerField;
    private javax.swing.JLabel securityqLabel;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
