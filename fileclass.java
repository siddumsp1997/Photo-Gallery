// Importing required packages
import java.util.*;
import java.io.*;
import java.lang.*;

// Class to handle the photos
public class fileclass {

	File file;
	FileReader fr;
	BufferedReader br;
	PrintStream fileStream;
	
	// Class constructor
	public fileclass(ArrayList<image> m)throws Exception
	{    int flag=1;
	    
		try {

			file = new File("image database.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
		    }
			
			else
			{
				fr=new FileReader("image database.txt");
				br=new BufferedReader(fr);
				
				String line;
				
				while((line=br.readLine())!=null)
				{       // Reading the details of every photo from the text file
					
					image x=new image();
					x.location=line;
					line=br.readLine();
					x.title=line;
					line=br.readLine();
					x.annotation=line;
					m.add(x);
				
				} //end of while	
				
			}
			//end of retrieving data from the file (else)
			
		} //end of try
		 
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end of constructor


	//function to update file
		public void updatefile(ArrayList<image> m)throws Exception 
		{    
			  fileStream = new PrintStream("image database.txt"); // Opening the text file 
			  
			  //Updating all the changes made, to the text file
			 if(m!=null){
			  for(image r:m)
			  {
				  fileStream.println(r.location);
				  fileStream.println(r.title);
				  fileStream.println(r.annotation);
				  
			  }
			  
			
			 }//end of if
			 
			fileStream.close(); 
				     
		}//end of updatefile	     
	
	//Function to close the text file
     public void closefile()throws Exception
	
	{   if(fr!=null&&br!=null){
		fr.close();
		br.close();
	    }
	}
}
//End of file class
