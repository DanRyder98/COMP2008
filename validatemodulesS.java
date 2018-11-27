import java.awt.*;
import javax.swing.*;

public class validatemodulesS extends JFrame {
	private static final long serialVersionUID = 6L;


	 public validatemodulesS(String title) throws HeadlessException {
	 super(title);
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 Dimension screenSize = toolkit.getScreenSize();
	 setSize(screenSize.width, screenSize.height);
	 setLocation(0, 0);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	//create the container and setlayout
	 Container contentPane = getContentPane();
	 contentPane.setLayout(new FlowLayout());
	 
	 
	 JLabel label4 = new JLabel ("Student name ");
	 contentPane.add(label4, BorderLayout.NORTH);
	 
	 
	 JTextField textField4 = new JTextField(20);
	 contentPane.add(textField4, BorderLayout.CENTER);
	 
	 JLabel label5 = new JLabel ("Registration number ");
	 contentPane.add(label5, BorderLayout.NORTH);
	 
	 
	 JTextField textField5 = new JTextField(20);
	 contentPane.add(textField5, BorderLayout.CENTER);
	 
	 
	 JButton button = new JButton("Search Modules");
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
		 new validatemodulesS("show module for a student");
	 }
}
