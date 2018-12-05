package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class CheckModules extends javax.swing.JFrame {
    public CheckModules() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarLabel = new javax.swing.JLabel();
        CheckModulesLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        StudentLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        StudentList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        SelectedModulesTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        OptionalModulesTable = new javax.swing.JTable();
        OptionalModulesLabel = new javax.swing.JLabel();
        SelectedModulesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrarLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RegistrarLabel.setText("Registrar");

        CheckModulesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        CheckModulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckModulesLabel.setText("Check Modules");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        StudentLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StudentLabel.setText("Student:");
        StudentLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

        StudentList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StudentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        StudentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        StudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StudentListMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(StudentList);

        SelectedModulesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Module Name", "Module Code", "Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SelectedModulesTable);

        OptionalModulesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Module Name", "Module Code", "Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(OptionalModulesTable);

        OptionalModulesLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        OptionalModulesLabel.setText("Optional Modules:");
        OptionalModulesLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

        SelectedModulesLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SelectedModulesLabel.setText("Selected Modules:");
        SelectedModulesLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                            .addComponent(RegistrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentLabel)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectedModulesLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OptionalModulesLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarLabel)
                .addGap(44, 44, 44)
                .addComponent(CheckModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OptionalModulesLabel)
                    .addComponent(SelectedModulesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new homepageR("Registrar menu").setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void StudentListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentListMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentListMousePressed

    private void StudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentListMouseClicked
        Object[] student = LevelList.getSelectedValues();
        List <Module> listOfStudentSelectedModules = new ArrayList<>();
        List <Module> listOfDegreeOptionalModules = new ArrayList<>();
        String creditsMessage = "";
        
        //Module Name
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).moduleCode, index, 0);
        }
        
        //Credits
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).credits, index, 0);
        }
        
      //Module Name
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).moduleCode, index, 0);
        }
        
        //Credits
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).credits, index, 0);
        }
    }//GEN-LAST:event_StudentListMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckModules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CheckModulesLabel;
    private javax.swing.JLabel OptionalModulesLabel;
    private javax.swing.JTable OptionalModulesTable;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JLabel SelectedModulesLabel;
    private javax.swing.JTable SelectedModulesTable;
    private javax.swing.JLabel StudentLabel;
    private javax.swing.JList<String> StudentList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
