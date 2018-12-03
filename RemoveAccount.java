import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Daniel Ryder
 */
public class RemoveAccount extends javax.swing.JFrame {

    /**
     * Creates new form RemoveAccount
     */
    public RemoveAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        AddAccountLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        NewUserDetailsLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        OutputLabel = new javax.swing.JLabel();
        RemoveUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddAccountLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddAccountLabel.setText("Remove Account");

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NewUserDetailsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        NewUserDetailsLabel.setText("User to remove:");

        UsernameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        UsernameLabel.setText("Username:");

        UsernameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UsernameTextField.setSelectionColor(new java.awt.Color(255, 102, 102));
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        OutputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        RemoveUser.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveUser.setText("Remove User");
        RemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                            .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BackButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewUserDetailsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UsernameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RemoveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(AddAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150)
                .addComponent(NewUserDetailsLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameTextField))
                .addGap(51, 51, 51)
                .addComponent(RemoveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(OutputLabel)
                .addGap(94, 94, 94)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new ManageAccounts().setVisible(true);
    }                                          

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void CheckErrors() {
        if (UsernameTextField.getText().isEmpty()) {
			 OutputLabel.setText("please fill all fields");
        }
        else if (UsernameTextField.getText().length() > 45) {
            OutputLabel.setText("Username is invalid");
        }
    }
    
    private void RemoveUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CheckErrors();
        
        String username = UsernameTextField.getText();
        String query = "DELETE FROM User WHERE username=" + username;
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AddAccountLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel NewUserDetailsLabel;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JButton RemoveUser;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    // End of variables declaration                   
}
