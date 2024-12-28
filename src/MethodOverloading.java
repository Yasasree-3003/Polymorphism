public class MethodOverloading
{
	public void add()
	{
		System.out.println("Hello");
	}
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(2,3);

	}

}

