import java.awt.*;
import javax.swing.*;

public class homepage extends JFrame {
	
	 private static final long serialVersionUID = 1L;
	 
	 public homepage(String title) throws HeadlessException {
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
		 JLabel label = new JLabel("Login");
		 contentPane.add(label, BorderLayout.NORTH);
		 label.setPreferredSize(new Dimension(50, 20));
		 
		 JLabel label2 = new JLabel("Username");
		 contentPane.add(label2, BorderLayout.NORTH);
		 label2.setPreferredSize(new Dimension(60, 30));
		 JTextField textField1 = new JTextField(20);
		 contentPane.add(textField1, BorderLayout.CENTER);
		 setVisible(true);
	 }
	 
	 public static void main(String[] args) {
		 new homepage ("Homepage");
	 }
}