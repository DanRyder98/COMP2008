package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class AddDegreeCourse extends javax.swing.JFrame {

    /**
     * Creates new form AddDegreeCourse
     */
    public AddDegreeCourse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        AddDegreeCourseLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        FullNameLabel = new javax.swing.JLabel();
        FullNameTextField = new javax.swing.JTextField();
        AbbreviatedNameLabel1 = new javax.swing.JLabel();
        AbbreviatedNameTextField = new javax.swing.JTextField();
        DepartmentsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DepartmentList = new javax.swing.JList<>();
        LeadDepartmentLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LeadDepartmentList = new javax.swing.JList<>();
        AddDegreeCourseButton = new javax.swing.JButton();
        OutputLabel = new javax.swing.JLabel();
        LevelLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LevelList = new javax.swing.JList<>();
        YearInIndustryLabel = new javax.swing.JLabel();
        YearInIndustryCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        AddDegreeCourseLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddDegreeCourseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddDegreeCourseLabel.setText("Add Degree Course");

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

        AbbreviatedNameLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AbbreviatedNameLabel1.setText("Abbreviated Name:");

        AbbreviatedNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AbbreviatedNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbreviatedNameTextFieldActionPerformed(evt);
            }
        });

        DepartmentsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentsLabel.setText("Department(s):");
        DepartmentsLabel.setToolTipText("Hold down CTRL to select multiple");

        DepartmentList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(DepartmentList);

        LeadDepartmentLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LeadDepartmentLabel.setText("Lead Department:");
        LeadDepartmentLabel.setToolTipText("Hold down CTRL to select multiple");

        LeadDepartmentList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LeadDepartmentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LeadDepartmentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(LeadDepartmentList);

        AddDegreeCourseButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AddDegreeCourseButton.setText("Add Degree Course");
        AddDegreeCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDegreeCourseButtonActionPerformed(evt);
            }
        });

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        OutputLabel.setToolTipText("Hold down CTRL to select multiple");

        LevelLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LevelLabel.setText("Level:");
        LevelLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

        LevelList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LevelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LevelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(LevelList);

        YearInIndustryLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        YearInIndustryLabel.setText("Year In Industry:");
        YearInIndustryLabel.setToolTipText("Hold down CTRL to select multiple");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FullNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(YearInIndustryLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AbbreviatedNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DepartmentsLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AbbreviatedNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearInIndustryCheckBox))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeadDepartmentLabel)
                    .addComponent(LevelLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(578, 578, 578)
                        .addComponent(OutputLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddDegreeCourseButton)
                        .addGap(376, 376, 376)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddDegreeCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(18, 18, 18)
                .addComponent(AddDegreeCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LeadDepartmentLabel)
                                    .addComponent(FullNameTextField))
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LevelLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(YearInIndustryCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FullNameLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AbbreviatedNameLabel1)
                                    .addComponent(AbbreviatedNameTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DepartmentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(YearInIndustryLabel)))
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddDegreeCourseButton)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new ManageDegree().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private boolean CheckErrors() {
        OutputLabel.setText("");
        if (FullNameTextField.getText().isEmpty() || AbbreviatedNameTextField.getText().isEmpty()) {
            OutputLabel.setText("please fill all fields");
            return false;
        }
        else if (FullNameTextField.getText().length() > 100) {
            
            OutputLabel.setText("Full Name is too long");
            return false;
        }
        else if (AbbreviatedNameTextField.getText().length() > 100) {
            OutputLabel.setText(OutputLabel.getText() + "Abbreviated Name is too long");
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
    
    private void AddDegreeCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDegreeCourseButtonActionPerformed
        CheckErrors();
        
        String fullname = FullNameTextField.getText();
        String abbreviatedName = AbbreviatedNameTextField.getText();
        
        Object[] departmentsObject = DepartmentList.getSelectedValues();
        
        Object[] leadDepartmentObject = LeadDepartmentList.getSelectedValues();
        
        boolean yearInIndustry = YearInIndustryCheckBox.isSelected();
        Object[] level = LevelList.getSelectedValues();
        
        if (CheckErrors()) {
            // If user didn't specify the level
            if(level == null) {//Only If the degree is in the table then update add to its associations
                if (DegreeController.isInDegreeTable(fullname))
                    CheckSuccess(DegreeController.addDegree(fullname, abbreviatedName, departmentsObject, leadDepartmentObject));
                }
            else//If the user did specify the level  
                CheckSuccess(DegreeController.addDegree(fullname, abbreviatedName, departmentsObject, leadDepartmentObject, level, yearInIndustry));
        }
        
    }//GEN-LAST:event_AddDegreeCourseButtonActionPerformed

    private void FullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTextFieldActionPerformed

    private void AbbreviatedNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbreviatedNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbbreviatedNameTextFieldActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDegreeCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AbbreviatedNameLabel1;
    private javax.swing.JTextField AbbreviatedNameTextField;
    private javax.swing.JButton AddDegreeCourseButton;
    private javax.swing.JLabel AddDegreeCourseLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JList<String> DepartmentList;
    private javax.swing.JLabel DepartmentsLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JLabel LeadDepartmentLabel;
    private javax.swing.JList<String> LeadDepartmentList;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JList<String> LevelList;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JCheckBox YearInIndustryCheckBox;
    private javax.swing.JLabel YearInIndustryLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
