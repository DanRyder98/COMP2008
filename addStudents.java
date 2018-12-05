package Admin;
import java.awt.*;
import javax.swing.*;

import database.DegreeController;
import database.StudentController;


public class addStudents extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudents
     */
    public addStudents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        RegistrarLabel = new javax.swing.JLabel();
        ManageStudentsLabel = new javax.swing.JLabel();
        RegNumberLabel = new javax.swing.JLabel();
        DegNameLabel = new javax.swing.JLabel();
        DegreeComboBox = new javax.swing.JComboBox<>();
        TitleLabel = new javax.swing.JLabel();
        SurnameLabel =  new javax.swing.JLabel();
        ForenameLabel = new javax.swing.JLabel();
        UniEmailLabel = new javax.swing.JLabel();
        PTutorLabel = new javax.swing.JLabel();
        RegNumberTextField = new javax.swing.JTextField();
        TitleComboBox=  new javax.swing.JComboBox<>();
        SurnameTextField = new javax.swing.JTextField();
        ForenameTextField = new javax.swing.JTextField();
        UniEmailTextField =  new javax.swing.JTextField();
        PTutorTextField =  new javax.swing.JTextField();
        AddStudentButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrarLabel.setFont(new java.awt.Font("Verdana", 0, 18)); 
        RegistrarLabel.setText("Registrar");

        ManageStudentsLabel.setFont(new java.awt.Font("Verdana", 0, 24)); 
        ManageStudentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageStudentsLabel.setText("Add Students");
        
        RegNumberLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        RegNumberLabel.setText("Registration Number");
        
        RegNumberTextField.setFont(new java.awt.Font("Verdana", 0, 18));
        RegNumberTextField.setText("");// enter value here 
        
        DegNameLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        DegNameLabel.setText("Degree Name");
        
        
        
        TitleLabel.setFont(new java.awt.Font("Verdana", 0, 18));
        TitleLabel.setText("Title");
        
        TitleComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); 
        TitleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Mr","Ms","Other"}));
        TitleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleComboBoxActionPerformed(evt);
            }
        });
        
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
        
        
        DegreeComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); 
        DegreeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DegreeController.getDegreeNameAsString()));
        DegreeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DegreeComboBoxActionPerformed(evt);
            }
        });
        

        AddStudentButton.setFont(new java.awt.Font("Verdana", 0, 14)); 
        AddStudentButton.setText("Add Information");
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(DegNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(DegreeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(TitleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ForenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(ForenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UniEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(UniEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addComponent(PTutorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(DegNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(DegreeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(TitleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(SurnameTextField)
                .addComponent(ForenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(ForenameTextField)
                .addComponent(UniEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(UniEmailTextField)
                .addComponent(PTutorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(PTutorTextField)
                .addComponent(AddStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(187, 187, 187)
                .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>                        

    private void UpdateStudentAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {     
    	if (RegNumberTextField.getText().isEmpty() ||  SurnameTextField.getText().isEmpty()||
    			ForenameTextField.getText().isEmpty() || UniEmailTextField.getText().isEmpty()||PTutorTextField.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null,"please fill all fields");
		 } else if(RegNumberTextField.getText().length()>9||RegNumberTextField.getText().length()>9) {
			 JOptionPane.showMessageDialog(null,"Registration number must be 9 ");
		 }else {
			 String degreeName = (String)DegreeComboBox.getSelectedItem();
			 String registrationNumber = RegNumberTextField.getText();
			 String surname = SurnameTextField.getText();
			 String forename = ForenameTextField.getText();
			 String title =(String)TitleComboBox.getSelectedItem();
			 String universityEmail = UniEmailTextField.getText();
			 String personalTutor = PTutorTextField.getText();
			 CheckSuccess(StudentController.addStudent(registrationNumber, surname, forename, title, degreeName, universityEmail, personalTutor));
		 }
    
    }                                                

                                                 

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setVisible(false);
        new homepageR("home page").setVisible(true);
    }                                    
    private void CheckSuccess(boolean success) {
        if (success) {
            JOptionPane.showMessageDialog(null,"Success");
        }
        else {
            JOptionPane.showMessageDialog(null,"SQl error");
        }
    }
    
    private void DegreeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
            
       }
    private void TitleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
       
       }
    

    public static void main(String args[]) {
        
            
                new addStudents().setVisible(true);
    }

                       
    private javax.swing.JButton AddStudentButton;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ManageStudentsLabel;
    private javax.swing.JLabel RegNumberLabel;
    private javax.swing.JLabel DegNameLabel;
    private javax.swing.JComboBox<String> DegreeComboBox;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel ForenameLabel;
    private javax.swing.JLabel UniEmailLabel;
    private javax.swing.JLabel PTutorLabel;
    private javax.swing.JTextField RegNumberTextField;
    private javax.swing.JComboBox<String> TitleComboBox;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JTextField ForenameTextField;
    private javax.swing.JTextField UniEmailTextField;
    private javax.swing.JTextField PTutorTextField;
    
    
    // End of variables declaration                   
}
