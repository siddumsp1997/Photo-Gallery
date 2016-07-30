//Importing packages for the GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Main class
public class mainclass extends JFrame{
	
	public static void main(String args[])
	{       // Arraylist for storing images' details
		imagelist.images=new ArrayList<>();
		
		try {
			imagelist.ff=new fileclass(imagelist.images);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//Moving to the main menu
		firstpage fd=new firstpage();
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fd.setSize(540,500);
		fd.setVisible(true);
		
		
		try {   //Closing the text file after the program is closed
			imagelist.ff.closefile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //End of main function
}
//End of main class
