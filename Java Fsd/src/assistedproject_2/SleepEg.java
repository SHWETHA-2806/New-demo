package assistedproject_2;

 class SleepEg {	
	private static Object o = new Object();   
public static void main(String[] args)throws InterruptedException   
	 {            
	        Thread.sleep(3000);   
	        System.out.println( Thread.currentThread().getName() +   
	        " Thread is woken after two second");   
	        synchronized (o)    
	        {     o.wait(2000);   
	            System.out.println(o + " Object woken up after 2 second of waiting");   
	        }   
	    }   
	} 