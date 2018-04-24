class Copy
{
 int a,b;
 {
	 Copy(int x,int y)
	 {
		 a=x;
		 b=y;
	 }
	 Copy()
	 {
		 
	 }
	 void show()
	 {
		 System.out.println(a+" "+b);
	 }
 }
	 public static void main(String[] arr)
	 {
		 Copy obj=new Copy(7,9);
		 obj.show();
		 
	 }
 }
