abstract class Abs
{
	abstract void disp();
	void show()
	{
		
		System.out.println("Hellooo");
	}
	
}
class Bcs extends Abs
{
	void disp()
	{
		System.out.println("Hiii");
	}
	public static void main(String[] arr)
	{
		Bcs x=new Bcs();
		x.disp();
		x.show();
		
	}
	
}