package Admin;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class manageSearch extends JFrame {
	private static final long serialVersionUID = 9L;


	 public manageSearch(String title) throws HeadlessException {
	 super(title);
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 Dimension screenSize = toolkit.getScreenSize();
	 setSize(screenSize.width, screenSize.height);
	 setLocation(0, 0);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	//create the container and setlayout
	 Container contentPane = getContentPane();
	 contentPane.setLayout(new FlowLayout());
	 
	 

	 
	 JLabel label5 = new JLabel ("Registration number ");
	 contentPane.add(label5, BorderLayout.NORTH);
	 
	 
	 textField5 = new javax.swing.JTextField(20);
	 contentPane.add(textField5, BorderLayout.CENTER);
	 
	 
	 JButton button = new JButton("Search Student");
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
		 if(textField5.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null,"please fill all fields ");
		 }else if(textField5.getText().length()>9||textField5.getText().length()>9) {
			 JOptionPane.showMessageDialog(null,"Registration number must be 9 ");
		 }
		 else
			 this.setVisible(false);
			 new manageStudents().setVisible(true);
         
     }
	 
	 private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
		 this.setVisible(false);
	        new homepageR("homepage").setVisible(true);
     }
	 public static void main(String[] args) {
		 new manageSearch("search for student");
	 }
	 private javax.swing.JTextField textField5;
}
