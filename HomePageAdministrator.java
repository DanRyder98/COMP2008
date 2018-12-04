package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class HomePageAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form HomePageAdministrator
     */
    public HomePageAdministrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ManageAccountsButton = new javax.swing.JButton();
        ManageDepartmentsButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        ManageDegreeButton = new javax.swing.JButton();
        ManageModulesButton = new javax.swing.JButton();
        RemoveDepartmentDegreeAssociationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageAccountsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ManageAccountsButton.setText("Manage Accounts");
        ManageAccountsButton.setToolTipText("Add initial/ressit/repeat grades");
        ManageAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccountsButtonActionPerformed(evt);
            }
        });

        ManageDepartmentsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ManageDepartmentsButton.setText("Manage Departments");
        ManageDepartmentsButton.setToolTipText("Update initial/resit/repeat grades");
        ManageDepartmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDepartmentsButtonActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Welcome");

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        LogOutButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        ManageDegreeButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ManageDegreeButton.setText("Manage Degree");
        ManageDegreeButton.setToolTipText("Add initial/ressit/repeat grades");
        ManageDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDegreeButtonActionPerformed(evt);
            }
        });

        ManageModulesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ManageModulesButton.setText("Manage Modules");
        ManageModulesButton.setToolTipText("Add initial/ressit/repeat grades");
        ManageModulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageModulesButtonActionPerformed(evt);
            }
        });

        RemoveDepartmentDegreeAssociationButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveDepartmentDegreeAssociationButton.setText("Remove Department Degree Association");
        RemoveDepartmentDegreeAssociationButton.setToolTipText("Add initial/ressit/repeat grades");
        RemoveDepartmentDegreeAssociationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDepartmentDegreeAssociationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ManageAccountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addComponent(ManageDegreeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveDepartmentDegreeAssociationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(50, 50, 50)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addComponent(ManageAccountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ManageDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ManageDegreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveDepartmentDegreeAssociationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ManageModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(138, 138, 138)
                .addComponent(LogOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void ManageAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.setVisible(false);
        new ManageAccounts().setVisible(true);
    }                                                    

    private void ManageDepartmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        this.setVisible(false);
        new ManageDepartments().setVisible(true);
    }                                                       

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.setVisible(false);
        new LoggingIn().setVisible(true);
    }                                            

    private void ManageDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        this.setVisible(false);
        new ManageDegree().setVisible(true);
    }                                                  

    private void ManageModulesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        this.setVisible(false);
        new ManageModules().setVisible(true);
    }                                                   

    private void RemoveDepartmentDegreeAssociationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                                        
        this.setVisible(false);
        new RemoveDepartmentDegreeAssociation().setVisible(true);
    }                                                                       

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePageAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton ManageAccountsButton;
    private javax.swing.JButton ManageDegreeButton;
    private javax.swing.JButton ManageDepartmentsButton;
    private javax.swing.JButton ManageModulesButton;
    private javax.swing.JButton RemoveDepartmentDegreeAssociationButton;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration                   
}
