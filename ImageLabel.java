// Importing swing packages for GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import javax.swing.*;
import java.lang.*;

//Class for Image label
class ImageLabel extends JLabel {
   
   //Components of the Image label
   Image image;
   ImageObserver imageObserver;

   // constructor with filename    
   ImageLabel(String filename) {

      ImageIcon icon = new ImageIcon(filename);   // File name of the image
      image = icon.getImage();
      imageObserver = icon.getImageObserver();

   }
   
   // constructor with Image icon
   ImageLabel(ImageIcon icon) {
   
      image = icon.getImage();     
      imageObserver = icon.getImageObserver();

   } // overload setIcon method

   void setIcon(ImageIcon icon) {

      image = icon.getImage();
      imageObserver = icon.getImageObserver();

   }
   // overload paint()

   public void paint( Graphics g ) {

       super.paint( g );
       g.drawImage(image,  0 , 0 , getWidth() , getHeight() , imageObserver);

   }

}
//End of class
