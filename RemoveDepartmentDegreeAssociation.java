package Admin;
import database2.DegreeController;
import database2.DepartmentController;
/**
 *
 * @author Daniel Ryder
 */
public class RemoveDepartmentDegreeAssociation extends javax.swing.JFrame {

    /**
     * Creates new form RemoveAssosiation
     */
    public RemoveDepartmentDegreeAssociation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RemoveAssosiationLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        FullNameOfDegreeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DepartmentList = new javax.swing.JList<>();
        DepartmentsLabel = new javax.swing.JLabel();
        RemoveAssosiationButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        FullNameTextField = new javax.swing.JTextField();
        OutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RemoveAssosiationLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        RemoveAssosiationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveAssosiationLabel.setText("Remove Assosiation");

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        FullNameOfDegreeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FullNameOfDegreeLabel.setText("Full Name of Degree:");

        DepartmentList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = DepartmentController.getDepartmentNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(DepartmentList);

        DepartmentsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentsLabel.setText("Department(s):");

        RemoveAssosiationButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        RemoveAssosiationButton.setText("Remove Assosiation");
        RemoveAssosiationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAssosiationButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        FullNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        FullNameTextField.setSelectionColor(new java.awt.Color(255, 102, 102));
        FullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameTextFieldActionPerformed(evt);
            }
        });

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
                    .addComponent(RemoveAssosiationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 258, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartmentsLabel)
                    .addComponent(FullNameOfDegreeLabel))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RemoveAssosiationButton)
                .addGap(33, 33, 33)
                .addComponent(OutputLabel)
                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminLabel)
                        .addGap(44, 44, 44)
                        .addComponent(RemoveAssosiationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FullNameOfDegreeLabel)
                            .addComponent(FullNameTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DepartmentsLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(RemoveAssosiationButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OutputLabel)))
                .addGap(60, 60, 60)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean CheckErrors() {
        if (FullNameTextField.getText().isEmpty() || DepartmentList.getSelectedValues() == null) {
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
    
    private void RemoveAssosiationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAssosiationButtonActionPerformed
        String fullname = FullNameTextField.getText();
        Object[] departments = DepartmentList.getSelectedValues();
        
        if (CheckErrors()) {
            CheckSuccess(DegreeController.removeDegreeDepartmentAssociation(fullname, departments));
        }
    }//GEN-LAST:event_RemoveAssosiationButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new HomePageAdministrator().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTextFieldActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveDepartmentDegreeAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveDepartmentDegreeAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveDepartmentDegreeAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveDepartmentDegreeAssociation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveDepartmentDegreeAssociation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JList<String> DepartmentList;
    private javax.swing.JLabel DepartmentsLabel;
    private javax.swing.JLabel FullNameOfDegreeLabel;
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JButton RemoveAssosiationButton;
    private javax.swing.JLabel RemoveAssosiationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
