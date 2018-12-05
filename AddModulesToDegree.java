package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class AddModulesToDegree extends javax.swing.JFrame {

    /**
     * Creates new form AddModulesToDegree
     */
    public AddModulesToDegree() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        AddModulesLabel = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        FullNameTextField = new javax.swing.JTextField();
        LevelLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LevelList = new javax.swing.JList<>();
        AddModuleButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ModuleLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ModuleList = new javax.swing.JList<>();
        OutputLabel = new javax.swing.JLabel();
        CoreModuleLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CoreModuleList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        AddModulesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddModulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddModulesLabel.setText("Add Modules To Degree");

        FullNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FullNameLabel.setText("Full Name:");

        FullNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        FullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameTextFieldActionPerformed(evt);
            }
        });

        LevelLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LevelLabel.setText("Level:");

        LevelList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LevelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LevelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(LevelList);

        AddModuleButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AddModuleButton.setText("Add Module");
        AddModuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModuleButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ModuleLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ModuleLabel.setText("Modules:");

        ModuleList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ModuleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ModuleList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(ModuleList);

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        CoreModuleLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CoreModuleLabel.setText("Core Modules:");

        CoreModuleList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CoreModuleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        CoreModuleList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(CoreModuleList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AddModuleButton)
                                .addGap(39, 39, 39)
                                .addComponent(OutputLabel)
                                .addGap(330, 330, 330))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ModuleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FullNameLabel)
                                        .addGap(101, 101, 101)
                                        .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LevelLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addComponent(CoreModuleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(AddModulesLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CoreModuleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FullNameLabel)
                            .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModuleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 128, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddModuleButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addComponent(BackButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTextFieldActionPerformed

    private boolean CheckErrors() {
        if (FullNameTextField.getText().isEmpty()) {
            OutputLabel.setText("Please fill all fields");
            return false;
        }
        else if (FullNameTextField.getText().length() > 100) {
            OutputLabel.setText("Full Name is too long");
            return false;
        }
        return true;
    }
    
    private void CheckSuccess(boolean success) {
        if (success) {
            OutputLabel.setText("Degree Added");
        }
        else {
            OutputLabel.setText("SQL Error");
        }
    }
    
    private void AddModuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddModuleButtonActionPerformed
        String fullname = FullNameTextField.getText();
        Object[] levelObject = LevelList.getSelectedValues();
        Object [] modules = ModuleList.getSelectedValues();
        Object [] coreModuleName = CoreModuleList.getSelectedValues();
        
        if (CheckErrors()) {
            CheckSuccess(ModuleController.addModulesToLevelOfDegree((String) levelObject[0], fullname, coreModuleName, modules));
        }
    }//GEN-LAST:event_AddModuleButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new ManageModules().setVisible(true);
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
            java.util.logging.Logger.getLogger(AddModulesToDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddModulesToDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddModulesToDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddModulesToDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddModulesToDegree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddModuleButton;
    private javax.swing.JLabel AddModulesLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CoreModuleLabel;
    private javax.swing.JList<String> CoreModuleList;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JList<String> LevelList;
    private javax.swing.JLabel ModuleLabel;
    private javax.swing.JList<String> ModuleList;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
