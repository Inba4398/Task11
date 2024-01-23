package Task11;

import java.io.FileInputStream;

public class FilenotFoundExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
	    //Open a file 
	            fis = new FileInputStream("D:/myfile.txt"); 
	    int k; 
	 
	    //read contents of the file
	        while(( k = fis.read() ) != -1) 
	    { 
	        System.out.print((char)k); 
	    } 
	 
	    //close the file
	    fis.close();     
	   }

	}

