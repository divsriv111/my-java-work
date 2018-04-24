class SuperTest
{
	int l=30;
	void disp()
	{
		System.out.println("this is super class")
	}
}
class Sub extends SuperTest
{
        void show()
		{
			System.out.println(super s)
			System.out.println("sub class")
			super.disp();
		}
		public static void main(String[] args)
		{
			Sub x=new Sub();
			x.show();
		}
}