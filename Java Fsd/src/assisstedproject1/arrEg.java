package assisstedproject1;
public class arrEg{

public static void main(String[] args) {

System.out.println("Single Dim Array");
int a[]= {3,6,9,12,15,18,21};
System.out.println("Array Elements : ");
for(int i=0;i<7;i++) {
System.out.println(+a[i]);
}

System.out.println("Multi Dim Array");

int[][] b = {
            {1, 2, 3, 4}, 
            {5, 6, 7} 
            };


      System.out.println("\nLength of row 1: " + b[0].length);
      System.out.println("\nLength of row 1: " + b[1].length);
      }
}

