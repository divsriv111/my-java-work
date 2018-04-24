class StatMethod
{
	static int a;
	int b;
	static void set()
	{
		a=10;
		//b=20;
	}
	void get()
	{
		a=20;
		b=30;
		System.out.println(a+" "+b);
	}
	public static void main(String[] arr)
	{
		StatMethod obj= new StatMethod();
	    obj.get();
		obj.set();
		
	}
}