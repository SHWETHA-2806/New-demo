package FileHandlingEg;
import java.io.File; 
import java.io.FileWriter;  
import java.io.IOException; 
import java.io.FileNotFoundException;   
import java.util.Scanner; 
import java.io.PrintWriter; 

class WriteToFile {  
	 void write () {  
	   
	 try {  
	     FileWriter fwrite = new FileWriter("C:\\JAVA FSD\\New-demo\\FileHandling.txt");  
	     
	     fwrite.write("Given content is addedd to the file and read");   
	 
	     fwrite.close();   
	     System.out.println("Content addedd to the file.");  
	 } catch (IOException e) {  
	     System.out.println("Unexpected error ");  
	     e.printStackTrace();  
	     }  
	 }  
	}  


class ReadFromFile {  
	 void Read() {  
	     try {  
	          
	         File f1 = new File("C:\\JAVA FSD\\New-demo\\FileHandling.txt");    
	         Scanner dataRead = new Scanner(f1);  
	         while (dataRead.hasNextLine()) {  
	             String fileData = dataRead.nextLine();  
	             System.out.println(fileData);  
	         }  
	         dataRead.close();  
	     } catch (FileNotFoundException exception) {  
	         System.out.println("Unexcpected error occurred!");  
	         exception.printStackTrace();  
	     }  
	 }  
	}  


class AppendToFile{   
	 
    void Appendd()throws FileNotFoundException {  
       PrintWriter pw=new PrintWriter("C:\\JAVA FSD\\New-demo\\FileHandling.txt");  
       char c='s';  
       pw.append(c);  
       System.out.println("The text file now contains Appended value . ");  
pw.flush();  
   }  
}  

	 

public class FileHandlingg {
public static void main(String args[]) throws FileNotFoundException {  
	try {  
	                       
	        File f0 = new File("C:\\JAVA FSD\\New-demo\\FileHandling.txt");   
	         if (f0.createNewFile()) {  
	         System.out.println("File " + f0.getName() + " is created successfully.");  
	         } else {  
	         System.out.println("File is already exist in the directory.");  
	         }  
	         } catch (IOException exception) {  
	         System.out.println("An unexpected error is occurred.");  
	         exception.printStackTrace();  
	                  }   
	         WriteToFile w = new WriteToFile();
             w.write();
             ReadFromFile r=new ReadFromFile();
             r.Read();
             AppendToFile a=new AppendToFile();
             a.Appendd();}}
	        

 
 




 


 

