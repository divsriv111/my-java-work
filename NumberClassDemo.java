class NumberClassDemo
{
	public static void main(String args[])
	{
		Integer a=new Integer(5);
		int i=a.intValue();
		System.out.println(i);
		
		Float b=new Float(5.5f);
		float j=b.floatValue();
		System.out.println(j);
		
		Character c=new Character('a');
		char k=c.charValue();
		System.out.println(k);
		
		Boolean d=new Boolean(true);
		boolean l=d.booleanValue();
		System.out.println(l);
		
		/*
		byteValue();
		shortValue();
		intValue();
		longValue();
		floatValue();
		doubleValue();
		*/
	}
}