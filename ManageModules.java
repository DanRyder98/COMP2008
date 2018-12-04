package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class ManageModules extends javax.swing.JFrame {

    public ManageModules() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        ManageModulesLabel = new javax.swing.JLabel();
        AddModulesButton = new javax.swing.JButton();
        RemoveModulesButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        AddModulesToDegreeButton = new javax.swing.JButton();
        RemoveModulesFromDegreeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        ManageModulesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ManageModulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageModulesLabel.setText("Manage Modules");

        AddModulesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddModulesButton.setText("Add Modules");
        AddModulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModulesButtonActionPerformed(evt);
            }
        });

        RemoveModulesButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveModulesButton.setText("Remove Modules");
        RemoveModulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveModulesButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        AddModulesToDegreeButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddModulesToDegreeButton.setText("Add Modules To Degree");
        AddModulesToDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModulesToDegreeButtonActionPerformed(evt);
            }
        });

        RemoveModulesFromDegreeButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RemoveModulesFromDegreeButton.setText("Remove Modules From Degree");
        RemoveModulesFromDegreeButton.setToolTipText("");
        RemoveModulesFromDegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveModulesFromDegreeButtonActionPerformed(evt);
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
                    .addComponent(ManageModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                    .addComponent(AddModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddModulesToDegreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveModulesFromDegreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(18, 18, 18)
                .addComponent(ManageModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(147, 147, 147)
                .addComponent(AddModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveModulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddModulesToDegreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(RemoveModulesFromDegreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130)
                .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddModulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddModulesButtonActionPerformed
        this.setVisible(false);
        new AddModulesOverall().setVisible(true);
    }//GEN-LAST:event_AddModulesButtonActionPerformed

    private void RemoveModulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveModulesButtonActionPerformed
        this.setVisible(false);
        new RemoveModulesOverall().setVisible(true);
    }//GEN-LAST:event_RemoveModulesButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new HomePageAdministrator().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddModulesToDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddModulesToDegreeButtonActionPerformed
        this.setVisible(false);
        new AddModulesToDegree().setVisible(true);
    }//GEN-LAST:event_AddModulesToDegreeButtonActionPerformed

    private void RemoveModulesFromDegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveModulesFromDegreeButtonActionPerformed
        this.setVisible(false);
        new RemoveModulesFromDegree().setVisible(true);
    }//GEN-LAST:event_RemoveModulesFromDegreeButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageModules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddModulesButton;
    private javax.swing.JButton AddModulesToDegreeButton;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ManageModulesLabel;
    private javax.swing.JButton RemoveModulesButton;
    private javax.swing.JButton RemoveModulesFromDegreeButton;
    // End of variables declaration//GEN-END:variables
}
