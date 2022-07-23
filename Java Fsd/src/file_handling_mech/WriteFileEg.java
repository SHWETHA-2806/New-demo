package file_handling_mech;
import java.io.FileWriter;    
import java.io.IOException;   

public class WriteFileEg {
   
	    public static void main(String[] args) {  
	      
	    try {  
	        FileWriter fwrite = new FileWriter("C:\\JAVA FSD\\New-demo\\New File.txt");   
	        fwrite.write("Content is added to the file which is mentioned. And it is read");    
	        fwrite.close();   
	        System.out.println("Content is addedd to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	    }  
	}  
	

