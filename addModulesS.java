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
	 
	 
	 JTextField textField1 = new JTextField(20);
	 contentPane.add(textField1, BorderLayout.CENTER);
	 
	 JLabel label2 = new JLabel ("Module Code ");
	 contentPane.add(label2, BorderLayout.NORTH);
	 
	 
	 JTextField textField2 = new JTextField(20);
	 contentPane.add(textField2, BorderLayout.CENTER);
	 
	 JLabel label3 = new JLabel ("Number of Credits ");
	 contentPane.add(label3, BorderLayout.NORTH);
	
	 
	 JTextField textField3 = new JTextField(20);
	 contentPane.add(textField3, BorderLayout.CENTER);
	 
	 JLabel label4 = new JLabel ("Student name ");
	 contentPane.add(label4, BorderLayout.NORTH);
	 
	 
	 JTextField textField4 = new JTextField(20);
	 contentPane.add(textField4, BorderLayout.CENTER);
	 
	 JLabel label5 = new JLabel ("Registration number ");
	 contentPane.add(label5, BorderLayout.NORTH);
	 
	 
	 JTextField textField5 = new JTextField(20);
	 contentPane.add(textField5, BorderLayout.CENTER);
	 
	 
	 JButton button = new JButton("Add module");
	 contentPane.add(button, BorderLayout.CENTER);
	 
	 button.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             buttonActionPerformed(evt);
             }
         });
	 setVisible(true);
	 
	 }
	 private void buttonActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
     }
	 public static void main(String[] args) {
		 new addModulesS("Adding new module for a student");
	 }
}
