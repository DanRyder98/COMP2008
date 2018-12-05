package Admin;
import java.util.ArrayList;
import java.util.List;

import database2.Grade;

/**
*
* @author Daniel Ryder
*/
public class StudentShowGrades extends javax.swing.JFrame {

   /**
    * Creates new form StudentShowGrades
    */
   public StudentShowGrades() {
       initComponents();
       List<Grade> averages = new ArrayList<>();
       averages.add(new Grade("1234","A", "Functional Programming", 56.1, 80));
       
       //Period Of Study
       for (int index=0; index<averages.size(); index++) {
       		AveragesTable.setValueAt(averages.get(index).label, index, 0);
       }
       
       //Period Of Study
       for (int index=0; index<averages.size(); index++) {
       		AveragesTable.setValueAt(averages.get(index).initialGrade, index, 1);
       }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       StudentLabel = new javax.swing.JLabel();
       RemoveModulesLabel = new javax.swing.JLabel();
       BackButton = new javax.swing.JButton();
       jScrollPane1 = new javax.swing.JScrollPane();
       GradesTable = new javax.swing.JTable();
       GradesLabel = new javax.swing.JLabel();
       LevelLabel = new javax.swing.JLabel();
       jScrollPane2 = new javax.swing.JScrollPane();
       LevelList = new javax.swing.JList<>();
       PeriodLabel = new javax.swing.JLabel();
       jScrollPane3 = new javax.swing.JScrollPane();
       PeriodList = new javax.swing.JList<>();
       jScrollPane4 = new javax.swing.JScrollPane();
       AveragesTable = new javax.swing.JTable();
       AveragesLabel = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       StudentLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       StudentLabel.setText("Student");

       RemoveModulesLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
       RemoveModulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       RemoveModulesLabel.setText("Grades");

       BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       BackButton.setText("Back");
       BackButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               BackButtonActionPerformed(evt);
           }
       });

       GradesTable.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
               {null, null, null},
               {null, null, null},
               {null, null, null},
               {null, null, null}
           },
           new String [] {
               "Module Name", "Initial Grade", "Resit Grade"
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
       jScrollPane1.setViewportView(GradesTable);

       GradesLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       GradesLabel.setText("Grades:");
       GradesLabel.setToolTipText("Hold down CTRL to select multiple or deselect");

       LevelLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       LevelLabel.setText("Levels:");
       LevelLabel.setToolTipText("Hold down CTRL to select multiple");

       LevelList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       LevelList.setModel(new javax.swing.AbstractListModel<String>() {
           String[] strings = { "1", "2", "3", "4", "5" };
           public int getSize() { return strings.length; }
           public String getElementAt(int i) { return strings[i]; }
       });
       LevelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
       LevelList.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               LevelListMouseClicked(evt);
           }
       });
       jScrollPane2.setViewportView(LevelList);

       PeriodLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       PeriodLabel.setText("Period:");
       PeriodLabel.setToolTipText("Hold down CTRL to select multiple");

       PeriodList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       PeriodList.setModel(new javax.swing.AbstractListModel<String>() {
           String[] strings = { "1", "2", "3" };
           public int getSize() { return strings.length; }
           public String getElementAt(int i) { return strings[i]; }
       });
       PeriodList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
       PeriodList.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               PeriodListMouseClicked(evt);
           }
       });
       jScrollPane3.setViewportView(PeriodList);

       AveragesTable.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
               {null, null},
               {null, null},
               {null, null},
               {null, null}
           },
           new String [] {
               "Period of Study", "Mean Average"
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
       jScrollPane4.setViewportView(AveragesTable);

       AveragesLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
       AveragesLabel.setText("Averages:");
       AveragesLabel.setToolTipText("Hold down CTRL to select multiple");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(StudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                       .addGap(119, 119, 119))
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(RemoveModulesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                       .addContainerGap())
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addGroup(layout.createSequentialGroup()
                               .addGap(0, 0, Short.MAX_VALUE)
                               .addComponent(BackButton))
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(LevelLabel)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                       .addGroup(layout.createSequentialGroup()
                                           .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                           .addComponent(PeriodLabel)
                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                           .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                       .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                   .addComponent(AveragesLabel))
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                       .addComponent(GradesLabel)
                                       .addGap(0, 0, Short.MAX_VALUE))
                                   .addComponent(jScrollPane1))))
                       .addContainerGap())))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(StudentLabel)
               .addGap(18, 18, 18)
               .addComponent(RemoveModulesLabel)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(PeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(AveragesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(8, 8, 8)
                       .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGroup(layout.createSequentialGroup()
                       .addGap(30, 30, 30)
                       .addComponent(GradesLabel)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
               .addComponent(BackButton)
               .addContainerGap())
       );

       pack();
   }// </editor-fold>                        

   private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       this.setVisible(false);
       new ManageModules().setVisible(true);
   }                                          

   private void LevelListMouseClicked(java.awt.event.MouseEvent evt) {                                       
       Object[] level = LevelList.getSelectedValues();
       String[] periodArrayString = {"A", "B", "C"}; //= function(level);
       PeriodList.setListData(periodArrayString);
   }                                      

   private void PeriodListMouseClicked(java.awt.event.MouseEvent evt) {                                        
       Object[] period = PeriodList.getSelectedValues();
       List<Grade> gradesList = new ArrayList<>();//function(period); 
       gradesList.add(new Grade("1234","A", "Functional Programming", 56.1, 80));
       //Module Name
       for (int index=0; index<gradesList.size(); index++) {
       	GradesTable.setValueAt(gradesList.get(index).moduleName, index, 0);
       }
       
       //Initial Grade
       for (int index=0; index<gradesList.size(); index++) {
       	GradesTable.setValueAt(gradesList.get(index).initialGrade, index, 1);
       }
       
       //Resit Grade
       for (int index=0; index<gradesList.size(); index++) {
       	GradesTable.setValueAt(gradesList.get(index).resitGrade, index, 2);
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
           java.util.logging.Logger.getLogger(StudentShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(StudentShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(StudentShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(StudentShowGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new StudentShowGrades().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JLabel AveragesLabel;
   private javax.swing.JTable AveragesTable;
   private javax.swing.JButton BackButton;
   private javax.swing.JLabel GradesLabel;
   private javax.swing.JTable GradesTable;
   private javax.swing.JLabel LevelLabel;
   private javax.swing.JList<String> LevelList;
   private javax.swing.JLabel PeriodLabel;
   private javax.swing.JList<String> PeriodList;
   private javax.swing.JLabel RemoveModulesLabel;
   private javax.swing.JLabel StudentLabel;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   // End of variables declaration                   
}
