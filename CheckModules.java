package Admin;
import java.util.ArrayList;
import java.util.List;

import database2.Module;
import database2.Student;
import database2.StudentController;
import database2.testTables;

/**
 *
 * @author Daniel Ryder
 */
public class CheckModules extends javax.swing.JFrame {
	
    List<Student> listOfStudents = StudentController.getStudents();
	
    public CheckModules() {
        initComponents();
        //Student Name
    	for (int index=0; index<listOfStudents.size(); index++) {
    		StudentTable.setValueAt(listOfStudents.get(index).forename + " " + listOfStudents.get(index).surname, index, 0);
    	}
    	
    	//Student Name
    	for (int index=0; index<listOfStudents.size(); index++) {
    		StudentTable.setValueAt(listOfStudents.get(index).registrationNumber, index, 1);
    	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        RegistrarLabel = new javax.swing.JLabel();
        CheckModulesLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        StudentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SelectedModulesTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        OptionalModulesTable = new javax.swing.JTable();
        OptionalModulesLabel = new javax.swing.JLabel();
        SelectedModulesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        CreditsMessageLabel = new javax.swing.JLabel();

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

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Registration Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(StudentTable);
        
        CreditsMessageLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        CreditsMessageLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreditsMessageLabel)
                .addGap(421, 421, 421)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectedModulesLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(OptionalModulesLabel)
                                .addContainerGap(158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrarLabel)
                        .addGap(44, 44, 44)
                        .addComponent(CheckModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OptionalModulesLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SelectedModulesLabel)
                                .addComponent(StudentLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(CreditsMessageLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new homepageR("Registrar menu").setVisible(true);
    }                                          

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {
       
    	Student student = listOfStudents.get(StudentTable.getSelectedRow());
        List <Module> listOfStudentSelectedModules = testTables.getModuleList(student.forename);
        List <Module> listOfDegreeOptionalModules = testTables.getModuleList(student.forename);
        String creditsMessage = "Good stuff";
        CreditsMessageLabel.setText(creditsMessage);
        
        //Module Name
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).moduleCode, index, 1);
        }
        
        //Credits
        for (int index=0; index<listOfStudentSelectedModules.size(); index++) {
        	SelectedModulesTable.setValueAt(listOfStudentSelectedModules.get(index).credits, index, 2);
        }
        
      //Module Name
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	OptionalModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).moduleName, index, 0);
        }
        
        //Module Code
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	OptionalModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).moduleCode, index, 1);
        }
        
        //Credits
        for (int index=0; index<listOfDegreeOptionalModules.size(); index++) {
        	OptionalModulesTable.setValueAt(listOfDegreeOptionalModules.get(index).credits, index, 2);
        }
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CheckModulesLabel;
    private javax.swing.JLabel CreditsMessageLabel;
    private javax.swing.JLabel OptionalModulesLabel;
    private javax.swing.JTable OptionalModulesTable;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JLabel SelectedModulesLabel;
    private javax.swing.JTable SelectedModulesTable;
    private javax.swing.JLabel StudentLabel;
    private javax.swing.JTable StudentTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration                   
}
