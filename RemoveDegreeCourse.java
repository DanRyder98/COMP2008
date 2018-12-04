package Admin;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Daniel Ryder
 */
public class RemoveDegreeCourse extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDegreeCourse
     */
    public RemoveDegreeCourse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        RemoveDegreeCourseLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        RemoveDegreeCourseButton = new javax.swing.JButton();
        ExistingCoursesLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ExistingCoursesList = new javax.swing.JList<>();
        OutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        RemoveDegreeCourseLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        RemoveDegreeCourseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveDegreeCourseLabel.setText("Remove Degree Course");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RemoveDegreeCourseButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        RemoveDegreeCourseButton.setText("Remove Degree Course");
        RemoveDegreeCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDegreeCourseButtonActionPerformed(evt);
            }
        });

        ExistingCoursesLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ExistingCoursesLabel.setText("Existing Courses:");

        ExistingCoursesList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ExistingCoursesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ExistingCoursesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(ExistingCoursesList);

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton))
                    .addComponent(RemoveDegreeCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ExistingCoursesLabel)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemoveDegreeCourseButton)
                        .addGap(57, 57, 57)
                        .addComponent(OutputLabel)))
                .addGap(34, 364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(RemoveDegreeCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(ExistingCoursesLabel)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveDegreeCourseButton)
                    .addComponent(OutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new ManageDegree().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private boolean CheckErrors() {
        if (ExistingCoursesList.getSelectedValues() == null) {
            OutputLabel.setText("Please fill all fields");
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
    
    private void RemoveDegreeCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDegreeCourseButtonActionPerformed
        Object[] existingCourses = ExistingCoursesList.getSelectedValues();
        
        if (CheckErrors()) {
            CheckSuccess(DegreeController.removeDegreeDepartmentAssociation((String) existingCourses[0]));
        }
    }//GEN-LAST:event_RemoveDegreeCourseButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveDegreeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveDegreeCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ExistingCoursesLabel;
    private javax.swing.JList<String> ExistingCoursesList;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JButton RemoveDegreeCourseButton;
    private javax.swing.JLabel RemoveDegreeCourseLabel;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
