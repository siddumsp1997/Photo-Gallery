
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

import javax.swing.*;

public class mainclass extends JFrame{
	
	public static void main(String args[])
	{
		
		imagelist.images=new ArrayList<>();
		
		try {
			imagelist.ff=new fileclass(imagelist.images);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		firstpage fd=new firstpage();
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fd.setSize(540,500);
		fd.setVisible(true);
		
		
		try {
			imagelist.ff.closefile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

//imagelist.ff.updatefile(imagelist.images);