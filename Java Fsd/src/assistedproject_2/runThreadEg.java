package assistedproject_2;
	
class TR implements Runnable{
   
    public void run(){
    System.out.println("Thread is running");
       }
}

public class runThreadEg{
 public static void main(String[] args) {
       TR obj1 = new TR(); 
      Thread t = new Thread(obj1); 
      t.start();
 }
}