import java.awt.*;
import javax.swing.*;

public class removeModulesS extends JFrame {
	private static final long serialVersionUID = 6L;


	 public removeModulesS(String title) throws HeadlessException {
	 super(title);
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 Dimension screenSize = toolkit.getScreenSize();
	 setSize(screenSize.width, screenSize.height);
	 setLocation(0, 0);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	//create the container and setlayout
	 Container contentPane = getContentPane();
	 contentPane.setLayout(new FlowLayout());
	 
	 RegistrarLabel = new javax.swing.JLabel();
     jScrollPane1 = new javax.swing.JScrollPane();
     jScrollPane2 = new javax.swing.JScrollPane();
     RemoveButton = new javax.swing.JButton();
     BackButton = new javax.swing.JButton();

	 
	
	 
     StudentTable = new javax.swing.JTable();
	 StudentTable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Title", "Surname", "Forename", "Registration Number"
	            }
	        ));
	 
	 ModuleTable = new javax.swing.JTable();
	 ModuleTable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Module Name", "Module Code", "Degree", "Degree Code"
	            }
	        ));
	 BackButton.setFont(new java.awt.Font("Verdana", 0, 18)); 
     BackButton.setText("Back");
     BackButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             BackButtonActionPerformed(evt);
         }
     });
     
     RemoveButton.setFont(new java.awt.Font("Verdana", 0, 18)); 
     RemoveButton.setText("Remove");
     RemoveButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             RemoveButtonActionPerformed(evt);
         }
     });
	 
	 
	 jScrollPane1.setViewportView(StudentTable);
	 jScrollPane2.setViewportView(ModuleTable);

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addComponent(RegistrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addGap(83, 83, 83)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(RemoveButton)
             .addContainerGap(94, Short.MAX_VALUE)
         	.addComponent(BackButton))
     );
     layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
         	.addComponent(RegistrarLabel)
             .addContainerGap(126, Short.MAX_VALUE)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(RemoveButton)
             .addGap(87, 87, 87))
         	.addComponent(BackButton)
     );


     pack();
	 
	
	 setVisible(true);
	 
	 }
	 private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {  
		
		  
			 //enter code here
			// CheckSuccess();//enter value
		 
         
     }
	 private void CheckSuccess(boolean success) {
	        if (success) {
	            JOptionPane.showMessageDialog(null,"Success");
	        }
	        else {
	            JOptionPane.showMessageDialog(null,"SQl error");
	        }
	    }
	 private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
		 this.setVisible(false);
	        new homepageR("homepage").setVisible(true);
     }
	 public static void main(String[] args) {
		 new removeModulesS("Removing module for a student");
	 }
	    private javax.swing.JLabel RegistrarLabel;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JButton RemoveButton;
	    private javax.swing.JButton BackButton;
	    private javax.swing.JTable StudentTable;
	    private javax.swing.JTable ModuleTable;

}
