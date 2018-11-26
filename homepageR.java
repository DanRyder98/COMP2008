//home page for Registrar

import java.awt.*;
import javax.swing.*;

public class homepageR extends JFrame{
	 private static final long serialVersionUID = 3L;

	 public homepageR(String title) throws HeadlessException {
		 // creating the window
		 super(title);
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 Dimension screenSize = toolkit.getScreenSize();
		 setSize(screenSize.width, screenSize.height);
		 setLocation(0, 0);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 
		 //create the container and setlayout
		 Container contentPane = getContentPane();
		 contentPane.setLayout(new GridLayout());
		 
		 // create label
		 //JLabel label = new JLabel ("Menu: ");
		 //contentPane.add(label, BorderLayout.NORTH);
		 //label.setPreferredSize(new Dimension(50, 20));
		 
		 // create buttons 
		 JButton manageAccounts = new JButton("Manage Accounts");
		 JButton addModules = new JButton("Add Modules");
		 JButton removeModules = new JButton("Remove Modules");
		 JButton validateModules = new JButton("Validate modules registration");
		
		 
		 //adding buttons
		 contentPane.setLayout(new GridLayout(2,2));
		 contentPane.add(manageAccounts);
		 contentPane.add(addModules);
		 contentPane.add(removeModules);
		 contentPane.add(validateModules);
		 
		 
		 setVisible(true);
	 }
	 public static void main(String[] args) {
		 new homepageR("Registrar menu");
		 
	 }
}
