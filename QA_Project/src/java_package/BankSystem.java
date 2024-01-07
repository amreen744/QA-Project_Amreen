package java_package;

public class BankSystem {
	
	BankSystem(String username,String password)
	{
		System.out.println(username+ " "+password);
	}

	int amt =1000;
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The new balance is "+amt);
	}
	
	void withdraw(int wt)
	{
		amt =amt-wt;
		System.out.println("The remaining balance is "+amt);
	}
	
	int display()
	{
		return amt;
	}
	public static void main(String[] args) {
		// Create an object
		BankSystem  obj= new BankSystem("12345","password");
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.display());
		
		

	}

}
