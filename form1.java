import java.awt.*;
import javax.swing.*;

public class form1 extends JFrame {
	private static final long serialVersionUID = 4L;


	 public form1(String title) throws HeadlessException {
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
	 label.setPreferredSize(new Dimension(50, 20));
	 
	 JTextField textField1 = new JTextField(20);
	 contentPane.add(textField1, BorderLayout.CENTER);
	 
	 JLabel label2 = new JLabel ("Module Code ");
	 contentPane.add(label2, BorderLayout.NORTH);
	 label.setPreferredSize(new Dimension(50, 20));
	 
	 JTextField textField2 = new JTextField(20);
	 contentPane.add(textField2, BorderLayout.CENTER);
	 
	 JLabel label3 = new JLabel ("Number of Credits ");
	 contentPane.add(label3, BorderLayout.NORTH);
	 label.setPreferredSize(new Dimension(50, 20));
	 
	 JTextField textField3 = new JTextField(20);
	 contentPane.add(textField3, BorderLayout.CENTER);
	 
	 
	 
	 setVisible(true);
	 
	 }
	 public static void main(String[] args) {
		 new form1("Adding new module");
	 }
}
