package file_handling_mech;

import java.io.File;  
import java.io.IOException; 

class CreateFileEg {  
            public static void main(String args[]) {  
            try {  
                    
                    File f = new File("C:\\JAVA FSD\\New-demo\\New File.txt");   
                    if (f.createNewFile()) {  
                               System.out.println("File " + f.getName() + " is created successfully.");  
                    } else {  
                               System.out.println("File is already exist in the directory.");  
                    }  
                  } catch (IOException exception) {  
                           System.out.println("An unexpected error is occurred.");  
                           exception.printStackTrace();  
               }   
     }  
}  