// ex of wrapper to primitive
class WrapperDemo2
{
	public static void main(String args[])
	{
		Integer a=new Integer(5);
		int i=a; //converting Integer inti int
		int j=a; //unboxing
		System.out.println(a+" "+i+" "+j);
	}
}