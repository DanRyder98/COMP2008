
import java.awt.*;
import javax.swing.*;

public class login extends JFrame {
	
	 private static final long serialVersionUID = 1L;
	 
	 public login(String title) throws HeadlessException {
		 // creating the window
		 super(title);
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 Dimension screenSize = toolkit.getScreenSize();
		 setSize(screenSize.width, screenSize.height);
		 setLocation(0, 0);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 // creating the container for the labels and others
		 Container contentPane = getContentPane();
		 contentPane.setLayout(new FlowLayout());
		 
		 
		 // label 1 for the login header
		 JLabel label = new JLabel("Login");
		 contentPane.add(label, BorderLayout.CENTER);
		 label.setPreferredSize(new Dimension(50, 20));
		 
		 // username label and text field 
		 JLabel label2 = new JLabel("Username");
		 contentPane.add(label2, BorderLayout.NORTH);
		 label2.setPreferredSize(new Dimension(60, 30));
		 JTextField textField1 = new JTextField(20);
		 contentPane.add(textField1, BorderLayout.CENTER);
		 
		 // password
		 JLabel label3 = new JLabel("Password");
		 JPasswordField passField = new JPasswordField(20);
		 contentPane.add(label3, BorderLayout.CENTER);
		 contentPane.add(passField, BorderLayout.CENTER);
		 
		 
		 setVisible(true);
	 }
	 
	 public static void main(String[] args) {
		 new login("login");
	 }
}
