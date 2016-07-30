// Importing swing packages for the GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Class for the first page (Frame)
public class firstpage extends JFrame {
	public firstpage() {
		
		super("PHOTO ALBUM ");  //Frame title
		
		getContentPane().setLayout(null);
		Font kf=new Font("Serif",Font.ITALIC,25);
		
		// Components of the frame
		JLabel lblWelcomeToDigital = new JLabel("WELCOME TO DIGITAL PHOTO ALBUM !!");
		lblWelcomeToDigital.setBounds(12, 39, 523, 29);
		getContentPane().add(lblWelcomeToDigital);
		lblWelcomeToDigital.setFont(kf);
		
		JTextArea textArea = new JTextArea("This Software helps to store all the awesome pics with your loved ones!!\n You can upload any picture (only JPG,PNG,GIF formats are allowed) by \nclicking ADD NEW PHOTO in the main menu.\n\nWe can store a maximum of 10 photos. If you want an upgraded version (which can \nstore as many photos as you wish), mail to siddumsp@gmail.com . \nYou can view the images on a larger size by clicking on the respective icon. \nYou can also delete any picture if you wish to, by clicking on the respective icon and \nselecting REMOVE PICTURE FROM THE ALBUM.\nOnce you close the software, it will get auto-saved and the concerned data will be \nstored in a text file 'image database.txt' in your workspace. Dont try to edit/delete/add \ndata (which may even lead to crashing the software) in the text file.\n\n\nThanks for downloading our software!!\nCOPYRIGHT © 2016 SIDDHARRTH_PRIYADHARSAN_M ALL RIGHTS RESERVED ");
		textArea.setBounds(22, 81, 457, 263);
		getContentPane().add(textArea);
		textArea.setEditable(false);
		
		//Button to exit program
		JButton btnNewButton = new JButton("EXIT PROGRAM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Exiting the program
				setVisible(false);
			}
		});
		btnNewButton.setBounds(22, 376, 204, 53);
		getContentPane().add(btnNewButton);
		
		// Button to proceed to next frame
		JButton btnNewButton_1 = new JButton("OKAY, GOT IT !!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  setVisible(false);
				  album piq=new album();
				  //Moving to next frame
		          piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		  piq.setSize(1000,939);
		  		  piq.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(265, 376, 192, 53);
		getContentPane().add(btnNewButton_1);
	}
	//End of constructor
}
//End of class
