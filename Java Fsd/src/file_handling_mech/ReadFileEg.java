package file_handling_mech;
import java.io.File;   
import java.io.FileNotFoundException;    
import java.util.Scanner;   
   
public class ReadFileEg {
	    public static void main(String[] args) {  
	        try {  
	           
	            File f = new File("C:\\JAVA FSD\\New-demo\\New File.txt");    
	            Scanner data = new Scanner(f);  
	            while (data.hasNextLine()) {  
	                String fileData = data.nextLine();  
	                System.out.println(fileData);  
	            }  
	            data.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexcpected error occurred!");  
	            exception.printStackTrace();  
	        }  
	    }  
	}  
