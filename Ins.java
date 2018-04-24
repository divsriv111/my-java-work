class Ins
{
	int a,b;
	void set(int x, int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] arr)
	{
		Ins x= new Ins();
		x.show();
		x.set(5,7);
		x.show();
		
		Ins y= new Ins();
		y.show();
		y.set(9,11);
		y.show();
		
		Ins z;
		z=y;
		z.show();
	}
}