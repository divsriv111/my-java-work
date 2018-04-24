class SuperTest
{
	public A(int a)
	void disp()
	{
		System.out.println("default"+a);
	}
}
class SuperCheck extends SuperTest
{
        public B(int b)
		{
			super(b);
			System.out.println("sub");
		}
		public static void main(String[] args)
		{
			new B(10);
		}
}