package Admin;
import java.awt.*;
import javax.swing.*;

public class addModulesS extends JFrame {
	private static final long serialVersionUID = 5L;


	 public addModulesS(String title) throws HeadlessException {
	 super(title);
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 Dimension screenSize = toolkit.getScreenSize();
	 setSize(screenSize.width, screenSize.height);
	 setLocation(0, 0);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	//create the container and setlayout
	 Container contentPane = getContentPane();
	 contentPane.setLayout(new FlowLayout());
	 
	 JLabel label = new JLabel ("Module Name ");
	 contentPane.add(label, BorderLayout.NORTH);
	 
	 
	 textField1 = new javax.swing.JTextField(20);
	 contentPane.add(textField1, BorderLayout.CENTER);
	 
	 JLabel label2 = new JLabel ("Module Code ");
	 contentPane.add(label2, BorderLayout.NORTH);
	 
	 
	 textField2 = new javax.swing.JTextField(20);
	 contentPane.add(textField2, BorderLayout.CENTER);
	 
	 JLabel label3 = new JLabel ("Number of Credits ");
	 contentPane.add(label3, BorderLayout.NORTH);
	
	 
	 textField3 = new javax.swing.JTextField(20);
	 contentPane.add(textField3, BorderLayout.CENTER);
	 
	 JLabel label4 = new JLabel ("Student name ");
	 contentPane.add(label4, BorderLayout.NORTH);
	 
	 
	 textField4 = new javax.swing.JTextField(20);
	 contentPane.add(textField4, BorderLayout.CENTER);
	 
	 JLabel label5 = new JLabel ("Registration number ");
	 contentPane.add(label5, BorderLayout.NORTH);
	 
	 
	 textField5 = new javax.swing.JTextField(20);
	 contentPane.add(textField5, BorderLayout.CENTER);
	 
	 
	 JButton button = new JButton("Add module");
	 contentPane.add(button, BorderLayout.CENTER);
	 
	 JButton backbutton = new JButton("Back");
	 contentPane.add(backbutton, BorderLayout.CENTER);
	 
	 button.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             buttonActionPerformed(evt);
             }
         });
	 backbutton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             BackButtonActionPerformed(evt);
             }
	  });
	 setVisible(true);
	 
	 }
	 private void buttonActionPerformed(java.awt.event.ActionEvent evt) { 
		 
		 if (textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty() || textField4.getText().isEmpty() || textField5.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null,"please fill all fields");
		 } else if(textField5.getText().length()>9||textField5.getText().length()>9) {
			 JOptionPane.showMessageDialog(null,"Registration number must be 9 ");
		 }else {
			 //Database code: (Adding optional module for student)
		 }
         
     }
	 private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
		 this.setVisible(false);
	        new homepageR("homepage").setVisible(true);
     }
	 public static void main(String[] args) {
		 new addModulesS("Adding new module for a student");
	 }
	 	private javax.swing.JTextField textField1;
	    private javax.swing.JTextField textField2;
	    private javax.swing.JTextField textField3;
	    private javax.swing.JTextField textField4;
	    private javax.swing.JTextField textField5;
}
