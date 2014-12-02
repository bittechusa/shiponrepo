package inherit2;

public class Constructor 
{
	int xion=10;
	String p="hello";
	void hung()
	{
		int xion=2000;
		System.out.println(xion);
		System.out.println(p);
	}
	void hung2()
	{
		System.out.println(xion);
	}
	void hung3()
	{
		System.out.println(xion);
	}
	Constructor (int c, String h)
	{
		xion=c;
		p=h;
	}
}
