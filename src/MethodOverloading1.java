class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
	float add(int a,float b,float c)
	{
		return a+b+c;
	}
	double add(float a,int b,double c)
	{
		return a+b+c;
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		float a1=10.11f,b1=20.22f,c1=16.23f;
		double a2=100.11,b2=10.11,c2=300.66;
       Calculator n=new Calculator();
       System.out.println(n.add(a, b));
       System.out.println(n.add(a,b1,c1));
       System.out.println(n.add(b,a1,b2));
       System.out.println(n.add(a1,c,c2));
	}
}
