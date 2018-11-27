import java.awt.*;
import javax.swing.*;

public class updateGrade extends JFrame {
	private static final long serialVersionUID = 8L;


	 public updateGrade(String title) throws HeadlessException {
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
	 
	 JLabel label3 = new JLabel ("Assingment name ");
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
	 
	 JLabel label6 = new JLabel ("Grade ");
	 contentPane.add(label6, BorderLayout.NORTH);
	 
	 
	 JTextField textField6 = new JTextField(20);
	 contentPane.add(textField6, BorderLayout.CENTER);
	 
	 JButton button = new JButton("update grades");
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
		 new updateGrade("Update Grades");
	 }
}
