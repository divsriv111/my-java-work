//ex of primitive to wrapper
class WrapperDemo1
{
	public static void main(String args[])
	{
		int a=5;
		Integer i=Integer.valueof(a);		//converting int into integer
		Integer j=a;  //autoboxing
		
		System.out.println(a+" "+i+" "+j);
	}
}