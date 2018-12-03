package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class AddAccount extends javax.swing.JFrame {

    /**
     * Creates new form AddAccount
     */
    public AddAccount() {
        initComponents();
        
        StudentNumberLabel.setVisible(false);
        StudentNumberTextField.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddAccountLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        NewUserDetailsLabel = new javax.swing.JLabel();
        PasswordLabel1 = new javax.swing.JLabel();
        AccountRoleComboBox = new javax.swing.JComboBox<>();
        AddAccountButton = new javax.swing.JButton();
        StudentNumberLabel = new javax.swing.JLabel();
        StudentNumberTextField = new javax.swing.JTextField();
        AccountAddedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddAccountLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddAccountLabel.setText("Add Account");

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        UsernameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        UsernameLabel.setText("Username:");

        PasswordLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PasswordLabel.setText("Password:");

        UsernameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UsernameTextField.setSelectionColor(new java.awt.Color(255, 102, 102));
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        PasswordTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PasswordTextField.setSelectionColor(new java.awt.Color(255, 102, 102));
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NewUserDetailsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        NewUserDetailsLabel.setText("New User Details:");

        PasswordLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PasswordLabel1.setText("Account Role:");

        AccountRoleComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AccountRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Registrar", "Teacher", "Student" }));
        AccountRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountRoleComboBoxActionPerformed(evt);
            }
        });

        AddAccountButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddAccountButton.setText("Add Account");
        AddAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountButtonActionPerformed(evt);
            }
        });

        StudentNumberLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StudentNumberLabel.setText("Student Number:");

        StudentNumberTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        StudentNumberTextField.setSelectionColor(new java.awt.Color(255, 102, 102));
        StudentNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumberTextFieldActionPerformed(evt);
            }
        });

        AccountAddedLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewUserDetailsLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameLabel)
                            .addComponent(PasswordLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PasswordLabel1)
                                    .addGap(83, 83, 83)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AccountRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(StudentNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(StudentNumberLabel))
                        .addGap(346, 561, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddAccountButton)
                        .addGap(494, 494, 494))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AccountAddedLabel)
                        .addGap(480, 480, 480))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(AddAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(NewUserDetailsLabel)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StudentNumberTextField))
                .addGap(53, 53, 53)
                .addComponent(AddAccountButton)
                .addGap(61, 61, 61)
                .addComponent(AccountAddedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new ManageAccounts().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed
    
    private void CheckErrors() {
        if (false) {
            AccountAddedLabel.setText("Account Added");
            AccountAddedLabel.setVisible(true);
        }
        else if (false) {
            AccountAddedLabel.setText("Error");
        }
        
        if (UsernameTextField.getText().isEmpty() || PasswordTextField.getText().isEmpty()) {
			 AccountAddedLabel.setText("please fill all fields");
        }
        else if (UsernameTextField.getText().length() > 45 || PasswordTextField.getText().length() > 45) {
            AccountAddedLabel.setText("Username/Password invalid");
        }
    }
    
    private void AddAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountButtonActionPerformed
        CheckErrors();
        
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();
        String role = (String)AccountRoleComboBox.getSelectedItem();
        Integer studentNumber = Integer.parseInt(StudentNumberTextField.getText());
        String query = "INSERT INTO User (username, password, role) VALUES (username, password, role)";
    }//GEN-LAST:event_AddAccountButtonActionPerformed

    private void AccountRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountRoleComboBoxActionPerformed
        String comboBoxValue = (String)AccountRoleComboBox.getSelectedItem();
        if (comboBoxValue.equals("Student")) {
            StudentNumberLabel.setVisible(true);
            StudentNumberTextField.setVisible(true);
        }
        else {
            StudentNumberLabel.setVisible(false);
            StudentNumberTextField.setVisible(false);
        }
    }//GEN-LAST:event_AccountRoleComboBoxActionPerformed

    private void StudentNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNumberTextFieldActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountAddedLabel;
    private javax.swing.JComboBox<String> AccountRoleComboBox;
    private javax.swing.JButton AddAccountButton;
    private javax.swing.JLabel AddAccountLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel NewUserDetailsLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JLabel StudentNumberLabel;
    private javax.swing.JTextField StudentNumberTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    // End of variables declaration//GEN-END:variables
}
