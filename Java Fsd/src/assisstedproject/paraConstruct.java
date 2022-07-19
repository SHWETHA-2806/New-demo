package assisstedproject;
class Empl{
	int empid;
	String name;

	Empl(int e,String n)
	{
	empid=e;
	name=n;
	}

	void display() {
	System.out.println(empid+" "+name);
	}
}

public class paraConstruct {
public static void main(String[] args) {

	Empl o1=new Empl(254,"Mala");
	Empl o2=new Empl(153,"Kavi");
	o1.display();
	o2.display();
		}
}

