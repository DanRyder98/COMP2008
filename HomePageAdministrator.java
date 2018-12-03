package Admin;

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageAccountsButton = new javax.swing.JButton();
        AddDepartmentsButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        RemoveDepartmentsButton = new javax.swing.JButton();
        AddDegreeCoursesButton = new javax.swing.JButton();
        RemoveDegreeCoursesButton = new javax.swing.JButton();
        AddModulesOverallButton = new javax.swing.JButton();
        RemoveModulesOverallButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageAccountsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ManageAccountsButton.setText("Manage Accounts");
        ManageAccountsButton.setToolTipText("Add initial/ressit/repeat grades");
        ManageAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccountsButtonActionPerformed(evt);
            }
        });

        AddDepartmentsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddDepartmentsButton.setText("Add Departments");
        AddDepartmentsButton.setToolTipText("Update initial/resit/repeat grades");
        AddDepartmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDepartmentsButtonActionPerformed(evt);
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

        RemoveDepartmentsButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveDepartmentsButton.setText("Remove Departments");
        RemoveDepartmentsButton.setToolTipText("Add initial/ressit/repeat grades");
        RemoveDepartmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDepartmentsButtonActionPerformed(evt);
            }
        });

        AddDegreeCoursesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddDegreeCoursesButton.setText("Add Degree Courses");
        AddDegreeCoursesButton.setToolTipText("Add initial/ressit/repeat grades");
        AddDegreeCoursesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDegreeCoursesButtonActionPerformed(evt);
            }
        });

        RemoveDegreeCoursesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveDegreeCoursesButton.setText("Remove Degree Courses");
        RemoveDegreeCoursesButton.setToolTipText("Add initial/ressit/repeat grades");
        RemoveDegreeCoursesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDegreeCoursesButtonActionPerformed(evt);
            }
        });

        AddModulesOverallButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddModulesOverallButton.setText("Add Modules Overall");
        AddModulesOverallButton.setToolTipText("Add initial/ressit/repeat grades");
        AddModulesOverallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModulesOverallButtonActionPerformed(evt);
            }
        });

        RemoveModulesOverallButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveModulesOverallButton.setText("Remove Modules Overall");
        RemoveModulesOverallButton.setToolTipText("Add initial/ressit/repeat grades");
        RemoveModulesOverallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveModulesOverallButtonActionPerformed(evt);
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
                    .addComponent(RemoveDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageAccountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addComponent(AddDegreeCoursesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveDegreeCoursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddModulesOverallButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveModulesOverallButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(50, 50, 50)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(ManageAccountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveDepartmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddDegreeCoursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveDegreeCoursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddModulesOverallButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveModulesOverallButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(LogOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAccountsButtonActionPerformed
        this.setVisible(false);
        new ManageAccounts().setVisible(true);
    }//GEN-LAST:event_ManageAccountsButtonActionPerformed

    private void AddDepartmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDepartmentsButtonActionPerformed
        this.setVisible(false);
        new AddDepartments().setVisible(true);
    }//GEN-LAST:event_AddDepartmentsButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        this.setVisible(false);
        new LoggingIn().setVisible(true);
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void RemoveDepartmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDepartmentsButtonActionPerformed
        this.setVisible(false);
        new RemoveDepartments().setVisible(true);
    }//GEN-LAST:event_RemoveDepartmentsButtonActionPerformed

    private void AddDegreeCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDegreeCoursesButtonActionPerformed
        this.setVisible(false);
        new AddDegreeCourse().setVisible(true);
    }//GEN-LAST:event_AddDegreeCoursesButtonActionPerformed

    private void RemoveDegreeCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDegreeCoursesButtonActionPerformed
        this.setVisible(false);
        new RemoveDegreeCourse().setVisible(true);
    }//GEN-LAST:event_RemoveDegreeCoursesButtonActionPerformed

    private void AddModulesOverallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddModulesOverallButtonActionPerformed
        this.setVisible(false);
        new AddModulesOverall().setVisible(true);
    }//GEN-LAST:event_AddModulesOverallButtonActionPerformed

    private void RemoveModulesOverallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveModulesOverallButtonActionPerformed
        this.setVisible(false);
        new RemoveModulesOverall().setVisible(true);
    }//GEN-LAST:event_RemoveModulesOverallButtonActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDegreeCoursesButton;
    private javax.swing.JButton AddDepartmentsButton;
    private javax.swing.JButton AddModulesOverallButton;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton ManageAccountsButton;
    private javax.swing.JButton RemoveDegreeCoursesButton;
    private javax.swing.JButton RemoveDepartmentsButton;
    private javax.swing.JButton RemoveModulesOverallButton;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
