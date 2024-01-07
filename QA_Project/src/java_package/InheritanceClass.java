package java_package;

public class InheritanceClass  implements Calculator {

	void username(String name)
	{
		System.out.println("the username of student is "+name);
	}
	void username(String name,String password )
	{
		System.out.println("the userename and password is "+name + " "+password);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceClass obj= new InheritanceClass();
		// method overloading
		obj.username("Amreen");
		obj.username("amreen", "amreen1234");
		
Student obj1= new Student();
obj1.details();
obj1.collegename();
// method overriding 
obj1.department();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void subt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}

}



class College
{
	
void collegename()
{
	System.out.println("The name of college is Cambridge");
}
void department()
{
	System.out.println("The name of department is IT");
}
}


class Student extends College
{
	void details ()
	{
		System.out.println("The name of student is Amreen");
	}
	
	void department()
	{
		System.out.println("The student department is CSE");
	}
	 
}