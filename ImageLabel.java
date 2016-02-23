import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

import java.lang.*;

class ImageLabel extends JLabel {

   Image image;
   ImageObserver imageObserver;

   // constructor with filename    

   ImageLabel(String filename) {

      ImageIcon icon = new ImageIcon(filename);

      image = icon.getImage();

      imageObserver = icon.getImageObserver();

   }

 

   ImageLabel(ImageIcon icon) {
   image = icon.getImage();

      imageObserver = icon.getImageObserver();

   }

 

   // overload setIcon method

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
