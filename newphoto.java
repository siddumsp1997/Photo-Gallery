
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.lang.*;

public class newphoto  extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	public image v;
	public int x,x1,x2;
	
	 public newphoto(){
		 super("Add new photo");
		 getContentPane().setLayout(null);
		 
		 JLabel lblImage = new JLabel("LOCATION:");
		 lblImage.setBounds(10, 21, 200, 50);
		 getContentPane().add(lblImage);
		 
		 v=new image();
		 
		 JLabel lblTitle = new JLabel("TITLE:");
		 lblTitle.setBounds(10, 87, 200, 50);
		 getContentPane().add(lblTitle);
		 
		 JLabel lblAnnotation = new JLabel("ANNOTATION:");
		 lblAnnotation.setBounds(10, 161, 200, 50);
		 getContentPane().add(lblAnnotation);
		 
		 textField = new JTextField();
		 textField.setBounds(79, 21, 636, 50);
		 getContentPane().add(textField);
		 textField.setColumns(10);
		 textField.setText(v.location);
		 
		 textField_1 = new JTextField();
		 textField_1.setBounds(89, 87, 719, 50);
		 getContentPane().add(textField_1);
		 textField_1.setColumns(10);
		 
		  textArea = new JTextArea();
		 textArea.setBounds(94, 156, 714, 69);
		 getContentPane().add(textArea);
		 
		 JButton btnNewButton = new JButton("<<BACK");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		  setVisible(false);
				  album piq=new album();
		          piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		  piq.setSize(1000,904);
		  		  piq.setVisible(true);
		 	}
		 });
		 btnNewButton.setBounds(32, 248, 346, 54);
		 getContentPane().add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("ADD TO ALBUM>>");
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		x=x1=x2=0;
		 		
		 		if(!textField.getText().equals(""))
				{   
					v.location=textField.getText();
					x=1;
					
				}
		 		
		 		if(!textField_1.getText().equals(""))
				{  
					v.title=textField_1.getText();
					x1=1;
					
				}
		 		if(!textArea.getText().equals(""))
		 		{
		 			v.annotation=textArea.getText();
		 			x2=1;
		 		}
		 		
		 		
		 		if(x==1&&x1==1&&x2==1){
		 		
		 		 imagelist.images.add(v);
		 		try {
					imagelist.ff.updatefile(imagelist.images);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 		 JOptionPane.showMessageDialog(null,"Photo added to album successfully !!");
		 		 setVisible(false);
				  album piq=new album();
		          piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		  piq.setSize(1000,904);
		  		  piq.setVisible(true);
		 		}
		 		else
		 		{
		 			JOptionPane.showMessageDialog(null,"Please enter all the details !!");
		 		}
		 		 
		 		
		 		
		 	}
		 });
		 btnNewButton_1.setBounds(406, 248, 416, 54);
		 getContentPane().add(btnNewButton_1);
		 
		 JButton btnNewButton_2 = new JButton("Browse");
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		JFileChooser chooser = new JFileChooser();
		 		 FileNameExtensionFilter filter = new FileNameExtensionFilter(
		 		        "JPG,PNG & GIF Images", "jpg", "gif","png");
		 		    chooser.setFileFilter(filter);
		 		    Component parent=null;
		 			int returnVal = chooser.showOpenDialog(parent);
		 		    if(returnVal == JFileChooser.APPROVE_OPTION) 
		 		    { 
		 		       textField.setText(chooser.getSelectedFile().getAbsolutePath());
		 		       
		 		    }
		 		
		 		
		 	}
		 });
		 btnNewButton_2.setBounds(727, 24, 111, 50);
		 getContentPane().add(btnNewButton_2);
		 
		 
	
	 }
}
