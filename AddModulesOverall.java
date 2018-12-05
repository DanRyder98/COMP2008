package Admin;
import database2.DepartmentController;
import database2.ModuleController;

/**
 *
 * @author Daniel Ryder
 */
public class AddModulesOverall extends javax.swing.JFrame {

    public AddModulesOverall() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        AddModulesLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        FullNameLabel = new javax.swing.JLabel();
        FullNameTextField = new javax.swing.JTextField();
        AbbreviatedNameLabel = new javax.swing.JLabel();
        AbbreviatedNameTextField = new javax.swing.JTextField();
        DepartmentsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DepartmentList = new javax.swing.JList<>();
        TeachingTimeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TeachingTimeList = new javax.swing.JList<>();
        CreditsLabel = new javax.swing.JLabel();
        AddModuleButton = new javax.swing.JButton();
        OutpuLabel = new javax.swing.JLabel();
        OutputLabel = new javax.swing.JLabel();
        CreditsComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        AddModulesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddModulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddModulesLabel.setText("Add Modules");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        FullNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FullNameLabel.setText("Full Name:");

        FullNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        FullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameTextFieldActionPerformed(evt);
            }
        });

        AbbreviatedNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AbbreviatedNameLabel.setText("Abbreviated Name:");

        AbbreviatedNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AbbreviatedNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbreviatedNameTextFieldActionPerformed(evt);
            }
        });

        DepartmentsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentsLabel.setText("Department(s):");

        DepartmentList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = DepartmentController.getDepartmentNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(DepartmentList);

        TeachingTimeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TeachingTimeLabel.setText("Teaching Time:");

        TeachingTimeList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TeachingTimeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Autumn", "Spring", "Summer", "Year long" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TeachingTimeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(TeachingTimeList);

        CreditsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CreditsLabel.setText("Credits:");

        AddModuleButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AddModuleButton.setText("Add Module");
        AddModuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModuleButtonActionPerformed(evt);
            }
        });

        OutpuLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        CreditsComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CreditsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "40", "60" }));
        CreditsComboBox.setSelectedIndex(1);
        CreditsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsComboBoxActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(979, 979, 979)
                                .addComponent(BackButton)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OutpuLabel)
                        .addGap(571, 571, 571))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputLabel)
                    .addComponent(AddModuleButton))
                .addGap(479, 479, 479))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(FullNameLabel)
                        .addGap(101, 101, 101)
                        .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbbreviatedNameLabel)
                            .addComponent(DepartmentsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbbreviatedNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TeachingTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreditsLabel)
                        .addGap(79, 79, 79)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreditsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(AddModulesLabel)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FullNameLabel)
                            .addComponent(FullNameTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AbbreviatedNameLabel)
                            .addComponent(AbbreviatedNameTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartmentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(OutpuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(OutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddModuleButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TeachingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreditsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(BackButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new ManageModules().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTextFieldActionPerformed

    private void AbbreviatedNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbreviatedNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbbreviatedNameTextFieldActionPerformed

    private boolean CheckErrors() {
        if (FullNameTextField.getText().isEmpty() || AbbreviatedNameTextField.getText().isEmpty()) {
            OutputLabel.setText("Please fill all fields");
            return false;
        }
        else if (FullNameTextField.getText().length() > 100) {
            OutputLabel.setText("Full Name is too long");
            return false;
        }
        else if (AbbreviatedNameTextField.getText().length() > 100) {
            OutputLabel.setText("Abbreviated Name is too long");
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
        CheckErrors();
        
        String fullname = FullNameTextField.getText();
        String abbreviatedName = AbbreviatedNameTextField.getText();
        Object[] departmentsObject = DepartmentList.getSelectedValues();
        Object[] teachingTimeObject = TeachingTimeList.getSelectedValues();
        String credits = (String)CreditsComboBox.getSelectedItem();
        int creditsi = Integer.parseInt(credits);
        
        if (CheckErrors()) {
            CheckSuccess(ModuleController.addModule(abbreviatedName, fullname, creditsi, (String) teachingTimeObject[0], (String) departmentsObject[0]));
        }
    }//GEN-LAST:event_AddModuleButtonActionPerformed

    private void CreditsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsComboBoxActionPerformed
        
    }//GEN-LAST:event_CreditsComboBoxActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddModulesOverall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddModulesOverall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddModulesOverall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddModulesOverall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddModulesOverall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AbbreviatedNameLabel;
    private javax.swing.JTextField AbbreviatedNameTextField;
    private javax.swing.JButton AddModuleButton;
    private javax.swing.JLabel AddModulesLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CreditsComboBox;
    private javax.swing.JLabel CreditsLabel;
    private javax.swing.JList<String> DepartmentList;
    private javax.swing.JLabel DepartmentsLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JLabel OutpuLabel;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JLabel TeachingTimeLabel;
    private javax.swing.JList<String> TeachingTimeList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
