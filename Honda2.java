abstract class Bike
{
final static int limit=30;
int l;
Bike(int a)
{
//System.out.println("constructor is invoked")
System.out.println(a);
}
void getDetails()
{
System.out.println("\nbike has two wheels");
l=5;
System.out.println(l);
}

abstract void run();
}

class Honda2 extends Bike
{
Honda2(int b)
{
super(b);
System.out.println(b);
}
void run()
{
System.out.println("\nrunning safely");
l=6;
System.out.println(l);
}

public static void main(String args[])
{
Bike obj=new Honda2(6);
obj.run();
obj.getDetails();
System.out.println("\nvalue of member:="+obj);
}
}