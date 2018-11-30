
import java.awt.*;
import javax.swing.*;


public class manageStudents extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudents
     */
    public manageStudents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        RegistrarLabel = new javax.swing.JLabel();
        ManageStudentsLabel = new javax.swing.JLabel();
        RegNumberLabel = new javax.swing.JLabel();
        DegCodeLabel = new javax.swing.JLabel();
        DegClassLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        SurnameLabel =  new javax.swing.JLabel();
        ForenameLabel = new javax.swing.JLabel();
        UniEmailLabel = new javax.swing.JLabel();
        PTutorLabel = new javax.swing.JLabel();
        RegNumberTextField = new javax.swing.JTextField();
        DegCodeTextField = new javax.swing.JTextField();
        DegClassTextField = new javax.swing.JTextField();
        TitleTextField =  new javax.swing.JTextField();
        SurnameTextField = new javax.swing.JTextField();
        ForenameTextField = new javax.swing.JTextField();
        UniEmailTextField =  new javax.swing.JTextField();
        PTutorTextField =  new javax.swing.JTextField();
        UpdateStudentButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrarLabel.setFont(new java.awt.Font("Verdana", 0, 18)); 
        RegistrarLabel.setText("Registrar");

        ManageStudentsLabel.setFont(new java.awt.Font("Verdana", 0, 24)); 
        ManageStudentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageStudentsLabel.setText("Manage Students");
        
        RegNumberLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        RegNumberLabel.setText("Registration Number");
        
        RegNumberTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        RegNumberTextField.setText("");// enter value here 
        
        DegCodeLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        DegCodeLabel.setText("Degree Code");
        
        DegCodeTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        DegCodeTextField.setText("");// enter value here
        
        DegClassLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        DegClassLabel.setText("Degree Class");
        
        DegClassTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        DegClassTextField.setText("");// enter value here
        
        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        TitleLabel.setText("Title");
        
        TitleTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        TitleTextField.setText("");// enter value here
        
        SurnameLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        SurnameLabel.setText("Surname");
        
        SurnameTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        SurnameTextField.setText("");// enter value here
        
        ForenameLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        ForenameLabel.setText("Forename");
        
        ForenameTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        ForenameTextField.setText("");// enter value here
        
        UniEmailLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        UniEmailLabel.setText("University Email");
        
        
        UniEmailTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        UniEmailTextField.setText("");// enter value here
        
        PTutorLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        PTutorLabel.setText("Personal Tutor");
        
        PTutorTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        PTutorTextField.setText("");// enter value here
        
        

        UpdateStudentButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UpdateStudentButton.setText("Update Information");
        UpdateStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentAccountButtonActionPerformed(evt);
            }
        });


        BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrarLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ManageStudentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(RegNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(RegNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DegCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(DegCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DegClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(DegClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ForenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(ForenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UniEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(UniEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(PTutorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarLabel)
                .addGap(18, 18, 18)
                .addComponent(ManageStudentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ManageStudentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(RegNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(RegNumberTextField)
                .addComponent(DegCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(DegCodeTextField)
                .addComponent(DegClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(DegClassTextField)
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(TitleTextField)
                .addComponent(SurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(SurnameTextField)
                .addComponent(ForenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(ForenameTextField)
                .addComponent(UniEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(UniEmailTextField)
                .addComponent(PTutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(PTutorTextField)
                .addComponent(UpdateStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(187, 187, 187)
                .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>                        

    private void UpdateStudentAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {     
    	if (RegNumberTextField.getText().isEmpty() || DegCodeTextField.getText().isEmpty() || DegClassTextField.getText().isEmpty() || TitleTextField.getText().isEmpty() || SurnameTextField.getText().isEmpty()||
    			ForenameTextField.getText().isEmpty() || UniEmailTextField.getText().isEmpty()||PTutorTextField.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null,"please fill all fields");
		 } else if(RegNumberTextField.getText().length()>9||RegNumberTextField.getText().length()>9) {
			 JOptionPane.showMessageDialog(null,"Registration number must be 9 ");
		 }else {
			 //enter code here
		 }
    
    }                                                

                                                 

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new homepageR("home page").setVisible(true);
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
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudents().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JButton UpdateStudentButton;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ManageStudentsLabel;
    private javax.swing.JLabel RegNumberLabel;
    private javax.swing.JLabel DegCodeLabel;
    private javax.swing.JLabel DegClassLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel ForenameLabel;
    private javax.swing.JLabel UniEmailLabel;
    private javax.swing.JLabel PTutorLabel;
    private javax.swing.JTextField RegNumberTextField;
    private javax.swing.JTextField DegCodeTextField;
    private javax.swing.JTextField DegClassTextField;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JTextField ForenameTextField;
    private javax.swing.JTextField UniEmailTextField;
    private javax.swing.JTextField PTutorTextField;
    
    
    // End of variables declaration                   
}
