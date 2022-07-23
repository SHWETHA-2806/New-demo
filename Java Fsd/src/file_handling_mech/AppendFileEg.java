package file_handling_mech;
import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
public class AppendFileEg {   
	 
	    public static void main(String[] args)throws FileNotFoundException {  
	        PrintWriter pw=new PrintWriter("C:\\JAVA FSD\\New-demo\\New File.txt");  
	        char c='s';  
	        pw.append(c);  
	        System.out.println("the text file now contains value of char'c' . ");  
	pw.flush();  
	    }  
	}  

