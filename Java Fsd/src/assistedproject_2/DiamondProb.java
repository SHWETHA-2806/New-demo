package assistedproject_2;

interface A
{  
    default void Disp() 
    { 
        System.out.println("Interface A"); 
    } 
} 
interface B
{  
    default void Disp() 
    { 
        System.out.println("Interface B"); 
    } 
}  
public class DiamondProb implements A,B
{  
    public void Disp() 
    {  
        A.super.Disp(); 
        B.super.Disp(); 
    } 
    public static void main(String args[]) 
    { 
        DiamondProb ob = new DiamondProb(); 
        ob.Disp(); 
    } 
}


