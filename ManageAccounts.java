package Admin;

/**
 *
 * @author Daniel Ryder
 */
public class ManageAccounts extends javax.swing.JFrame {

    /**
     * Creates new form ManageAccounts
     */
    public ManageAccounts() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        ManageAccountsLabel = new javax.swing.JLabel();
        AddAccountButton = new javax.swing.JButton();
        RemoveAccountButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        ManageAccountsLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ManageAccountsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageAccountsLabel.setText("Manage Accounts");

        AddAccountButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddAccountButton.setText("Add Account");
        AddAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountButtonActionPerformed(evt);
            }
        });

        RemoveAccountButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveAccountButton.setText("Remove Account");
        RemoveAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAccountButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ManageAccountsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(AddAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(18, 18, 18)
                .addComponent(ManageAccountsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(187, 187, 187)
                .addComponent(AddAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(RemoveAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(196, 196, 196)
                .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountButtonActionPerformed
        this.setVisible(false);
        new AddAccount().setVisible(true);
    }//GEN-LAST:event_AddAccountButtonActionPerformed

    private void RemoveAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAccountButtonActionPerformed
        this.setVisible(false);
        new RemoveAccount().setVisible(true);
    }//GEN-LAST:event_RemoveAccountButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new HomePageAdministrator().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccountButton;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ManageAccountsLabel;
    private javax.swing.JButton RemoveAccountButton;
    // End of variables declaration//GEN-END:variables
}
