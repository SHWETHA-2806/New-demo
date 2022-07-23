package file_handling_mech;
import java.io.File; 
public class DeleteFileEg { 
	  public static void main(String[] args) {   
	    File f0 = new File("C:\\JAVA FSD\\New-demo\\New File.txt");   
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	  }   
}
	

