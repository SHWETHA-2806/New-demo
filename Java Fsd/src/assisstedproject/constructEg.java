package assisstedproject;

class infor {
	int age;
	String name;

void show(){
		System.out.println(age+" "+name);
	}	
}
public class constructEg {
public static void main(String[]args){

	infor obj1= new infor();
	infor obj2= new infor();
		
	obj1.show();
	obj2.show();
	}
}
	
