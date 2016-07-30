//Importing swing packages for GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.*;

//Class for Album (Frame)
public class album extends JFrame{
	// Components of the frame
       // Can store upto 10 photos
	public JButton x[]=new JButton[10];
	public JLabel y[]=new JLabel[10];
	public int z,z1;
	public JLabel lblNoImagesTo;
	
	// Class constructor
	public album()
	{    super("PHOTO ALBUM");
             getContentPane().setLayout(null);
             Font pf2=new Font("Serif",Font.ITALIC,27);
             Font pf3=new Font("Serif",Font.ITALIC,19);
            
            //Button to add new photo
            JButton btnNewButton = new JButton("ADD NEW PHOTO");
            btnNewButton.addActionListener(new ActionListener() {
    	     public void actionPerformed(ActionEvent arg0) {
    		
    		if(imagelist.images.size()>=10){
    			JOptionPane.showMessageDialog(null,"                    Sorry !!\n You can't upload more than 10 pictures !! ");
    		}
    		
    	  else{
    		 setVisible(false);
                 newphoto piq=new newphoto();   // Move to the respective photo's frame
                 piq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		  piq.setSize(870,371);
  		  piq.setVisible(true);
    	}
    		
    	}
    	
    });
    btnNewButton.setBounds(472, 809, 458, 51);
    getContentPane().add(btnNewButton);
    
    // Button to exit the program
    JButton btnNewButton_1 = new JButton("EXIT PHOTO ALBUM");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		setVisible(false);
    	}
    });
    
    btnNewButton_1.setBounds(36, 809, 397, 51);
    getContentPane().add(btnNewButton_1);
    
    // Label of the frame
    JLabel label = new JLabel("CLICK ON THE IMAGE TO VIEW IT IN FULL SCREEN:");
    label.setBounds(37, 32, 800, 50);
    getContentPane().add(label);
    label.setFont(pf2);

		
		if(imagelist.images.size()==0)
		{
	        lblNoImagesTo = new JLabel("No images to display currently..");
		lblNoImagesTo.setBounds(254, 308, 700, 58);
		getContentPane().add(lblNoImagesTo);
		lblNoImagesTo.setFont(pf2);
			
		}
		
		else{   // Display all the existing photos
			  int x1=62; int y1=150;
			   
			for(z=0;z<imagelist.images.size();z++)
			{
				if(z==4||z==8)
				{
					x1=62;
					y1=y1+222;
				}
				//JLabel mylabel=new JLabel();
				ImageIcon pic = new ImageIcon(imagelist.images.get(z).location);
				
				//mylabel.setIcon(pic);
				Image image = pic.getImage();
			    // reduce by 50%
			    image = image.getScaledInstance(image.getWidth(null)/4, image.getHeight(null)/4, Image.SCALE_SMOOTH);
			    pic.setImage(image);
			    x[z]=new JButton(pic);
				x[z].setToolTipText(imagelist.images.get(z).annotation);
				x[z].setBounds(x1,y1,164, 158);
               
				x[z].setPreferredSize(new Dimension(164,158));
			    getContentPane().add(x[z]);
			    y[z]=new JLabel("       "+imagelist.images.get(z).title);
			    y[z].setBounds(x1,y1+177,164,23);
			    getContentPane().add(y[z]);
			    y[z].setFont(pf3);
			    
			    x1=x1+245;
			}
		
			
		} //end of else
		
	     if(x[0]!=null){
		 x[0].addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		setVisible(false);     // Move to the image's frame
		    		openphoto op=new openphoto(imagelist.images.get(0));
		    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    		op.setSize(1248,1025);
		    		op.setVisible(true);
		    	}
		 });
	     }
	       // Display the photos
	     if(x[1]!=null){
			 x[1].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(1));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setResizable(false);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     
	     if(x[2]!=null){
			 x[2].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(2));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[3]!=null){
			 x[3].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(3));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[4]!=null){
			 x[4].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(4));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[5]!=null){
			 x[5].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(5));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[6]!=null){
			 x[6].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(6));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[7]!=null){
			 x[7].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(7));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[8]!=null){
			 x[8].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(8));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	     if(x[9]!=null){
			 x[9].addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		
			    		setVisible(false);
			    		openphoto op=new openphoto(imagelist.images.get(9));
			    		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    		op.setSize(1248,1025);
			    		op.setVisible(true);
			    	}
			 });
		     }
	}//end of constructor
	
}//end of class

