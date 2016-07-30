// Swing packages for the GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.*;

// Class open photo for displaying every photo (Frame)
public class openphoto extends JFrame {
	
	//Components of the frame
	public image f;
	private JTextField textField;
	private ImageIcon image1;
	private ImageLabel imageLabel;
	
	//Class constructor
	public openphoto(image i)
	{   
		super(i.title);   // Frame title
		getContentPane().setLayout(null);
		f=i;
		Font pf2=new Font("Serif",Font.PLAIN,22);

	    image1 = new ImageIcon(f.location);
	    imageLabel = new ImageLabel(image1);
	    imageLabel.setBounds(23,25,1185,878);
	    imageLabel.setVisible(true);
		
		imageLabel.setToolTipText(f.annotation);
		getContentPane().add(imageLabel);
		
		// Button to go to main menu
		JButton btnNewButton = new JButton("<<BACK TO ALBUM");
		btnNewButton.setBounds(33, 916, 579, 45);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  setVisible(false);
				  album piq=new album();
				  //Going to previous frame
		          piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		  piq.setSize(1000,904);
		  		  piq.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pf2);
		
		// Button to delete the correponding picture
		JButton btnNewButton_1 = new JButton("REMOVE THIS PICTURE FROM ALBUM");
		btnNewButton_1.setBounds(641, 916, 567, 45);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				imagelist.images.remove(f); //Removing picture
				
				try {   //Updating the text file to save changes
					imagelist.ff.updatefile(imagelist.images);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Photo removed from album successfully !!");
				
		          //Going to main menu		
			    album piq=new album();
		            piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  	    piq.setSize(1000,904);
		  	    piq.setVisible(true);
				
			}
		});
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.setFont(pf2);
		
	}//end of constructor


}//end of class
