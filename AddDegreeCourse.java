import java.awt.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Daniel Ryder
 */
public class AddDepartments extends javax.swing.JFrame {

    /**
     * Creates new form AddDepartments
     */
    public AddDepartments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        AdminLabel = new javax.swing.JLabel();
        AddDepartmentLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        DepartmentDetailsLabel = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        AbbreviatedCodeLabel = new javax.swing.JLabel();
        FullNameTextField = new javax.swing.JTextField();
        AbbreviatedCodeTextField = new javax.swing.JTextField();
        AddDepartmentButton = new javax.swing.JButton();
        OutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AdminLabel.setText("Administrator");

        AddDepartmentLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        AddDepartmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddDepartmentLabel.setText("Add Department");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DepartmentDetailsLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepartmentDetailsLabel.setText("Department Details:");

        FullNameLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FullNameLabel.setText("Full Name:");

        AbbreviatedCodeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AbbreviatedCodeLabel.setText("Abbreviated Code:");
        AbbreviatedCodeLabel.setToolTipText("A three-letter code");

        FullNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        AbbreviatedCodeTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        AddDepartmentButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddDepartmentButton.setText("Add Department");
        AddDepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDepartmentButtonActionPerformed(evt);
            }
        });

        OutputLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        OutputLabel.setToolTipText("A three-letter code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                            .addComponent(AdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BackButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartmentDetailsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FullNameLabel)
                                    .addComponent(AbbreviatedCodeLabel))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AbbreviatedCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputLabel)
                    .addComponent(AddDepartmentButton))
                .addGap(445, 445, 445))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLabel)
                .addGap(44, 44, 44)
                .addComponent(AddDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85)
                .addComponent(DepartmentDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FullNameTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbbreviatedCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AbbreviatedCodeTextField))
                .addGap(54, 54, 54)
                .addComponent(OutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(AddDepartmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(116, 116, 116)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new HomePageAdministrator().setVisible(true);
    }                                          

    private void CheckErrors() {
        if (FullNameTextField.getText().isEmpty() || AbbreviatedCodeTextField.getText().isEmpty()) {
			 OutputLabel.setText("please fill all fields");
        }
        else if (FullNameTextField.getText().length() > 100) {
            OutputLabel.setText("Full Name is too long");
        }
        else if (AbbreviatedCodeTextField.getText().length() > 100) {
            OutputLabel.setText("Abbreviated Name is too long");
        }
    }
    
    private void AddDepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        CheckErrors();
        
        String fullname = FullNameTextField.getText();
        String abbreviatedCode = AbbreviatedCodeTextField.getText();
        String query = "INSERT INTO Department (departmentCode, departmentName) VALUES (abbreviatedCode, fullname)";
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
            java.util.logging.Logger.getLogger(AddDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AbbreviatedCodeLabel;
    private javax.swing.JTextField AbbreviatedCodeTextField;
    private javax.swing.JButton AddDepartmentButton;
    private javax.swing.JLabel AddDepartmentLabel;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel DepartmentDetailsLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JTextField FullNameTextField;
    private javax.swing.JLabel OutputLabel;
    // End of variables declaration                   
}
