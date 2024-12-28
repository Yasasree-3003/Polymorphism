
class Bank 
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	@Override
	int getRateOfInterest()
	{
		return 9;
	}
}
class Axis extends Bank
{
	@Override
	int getRateOfInterest()
	{
		return 8;
	}
  }
class HDFC extends Bank
{
	@Override
	int getRateOfInterest()
	{
		return 7;
	}
}
public class MethodOverride1 {

	public static void main(String[] args) {
		SBI s=new SBI();
		Axis a=new Axis();
		HDFC h=new HDFC();
		System.out.println("The rate of interest of SBI is:"+s.getRateOfInterest());
		System.out.println("The rate of interest of Axis is:"+a.getRateOfInterest());
		System.out.println("The rate of interest of HDFC is:"+h.getRateOfInterest());
	}

}
