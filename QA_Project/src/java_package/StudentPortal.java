package java_package;

public class StudentPortal extends StudentProfile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void loginCredentails() {
		// TODO Auto-generated method stub
		System.out.println("The username of the student");
		System.out.println("the password of the student");
	}

}

abstract class StudentProfile
{
	void studentDetails()
	{
		System.out.println("The name of students Amreen");
	}
	abstract void loginCredentails();
}