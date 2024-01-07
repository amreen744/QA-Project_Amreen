package java_package;

public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obbj = new Bank();
		obbj.setBalance(1000);
		System.out.println(obbj.getBalance());
	}

}

class Bank
{
	private int bal;
	
	void setBalance(int bl)
	{
		bal=bl;
	}
	int getBalance()
	{
		return bal;
	}
}
