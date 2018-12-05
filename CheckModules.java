package Admin;

import java.util.ArrayList;
import java.util.List;

import database.Module;

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
        LevelList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        //This should be called student list I'll change it
        LevelList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LevelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"student1","student2","student3"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LevelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(LevelList);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
            		//THESE WILL BE THE COLUMN TITLES WHATEVER ORDER YOU WANT
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Module Name, Module Code, Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarLabel)
                .addGap(44, 44, 44)
                .addComponent(CheckModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(StudentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void StudentListMouseClicked(java.awt.event.MouseEvent evt) {                                         
        Object[] student = LevelList.getSelectedValues();
        List <Module> listOfStudentSelectedModules = new ArrayList<>();
        List <Module> listOfDegreeOptionalModules = new ArrayList<>();
        String creditsMessage = "";
        
        //Module Name
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	jTable1.setValueAt(listOfStudentSelectedModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	jTable1.setValueAt(listOfStudentSelectedModules.get(index).moduleCode, index, 0);
        }
        
        //Credits
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	jTable1.setValueAt(listOfStudentSelectedModules.get(index).credits, index, 0);
        }
        
      //Module Name
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	jTable1.setValueAt(listOfDegreeOptionalModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	jTable1.setValueAt(listOfDegreeOptionalModules.get(index).moduleCode, index, 0);
        }
        
        //Credits
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	jTable1.setValueAt(listOfDegreeOptionalModules.get(index).credits, index, 0);
        }
    } 

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new homepageR("Registrar menu").setVisible(true);
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
    private javax.swing.JList<String> LevelList;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JLabel StudentLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
