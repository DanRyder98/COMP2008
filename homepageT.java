//home page for Registrar

import java.awt.*;
import javax.swing.*;

public class homepageT extends JFrame{
	 private static final long serialVersionUID = 2L;

	 public homepageT(String title) throws HeadlessException {
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
		 JButton addGrades = new JButton("Add Grades");
		 JButton updateGrades = new JButton("Update Grades");
		 JButton meanGrade = new JButton("Mean Grade");
		
		
		 
		 //adding buttons
		 contentPane.setLayout(new GridLayout(1,3));
		 contentPane.add(addGrades);
		 contentPane.add(updateGrades);
		 contentPane.add(meanGrade);
		 
		 
		 setVisible(true);
	 }
	 public static void main(String[] args) {
		 new homepageT("Teacher menu");
		 
	 }
}
