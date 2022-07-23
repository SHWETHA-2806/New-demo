package assistedproject_2;

class Table{  
synchronized void printTable(int n){
 for(int i=1;i<=5;i++){  
   System.out.println(n*i);  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
 }  

}  
}  

class Thread1 extends Thread{  
Table a;  
Thread1(Table a){  
this.a=a;  
}  
public void run(){  
a.printTable(5);  
}  

}  
class Thread2 extends Thread{  
Table a;  
Thread2(Table a){  
this.a=a;  
}  
public void run(){  
a.printTable(100);  
}  
}  

public class SyncEg{  
public static void main(String args[]){  
Table obj = new Table();
Thread1 a1=new Thread1(obj);  
Thread2 a2=new Thread2(obj);  
a1.start();  
a2.start();  
}  
} 

