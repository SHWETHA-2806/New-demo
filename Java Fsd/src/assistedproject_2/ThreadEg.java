package assistedproject_2;

	public class ThreadEg extends Thread
	{
	 	public void run()
	 	{  
	 		
	  		System.out.println("Thread is extended");
	}
	 	public static void main( String args[] )
	 	{
	  		ThreadEg t = new ThreadEg();
	  		t.start();
	 	}
	}


