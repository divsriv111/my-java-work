import java.util.Scanner;
class Tj
{
public static void main(String[] arr)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a int no:");
int a= sc.nextInt();
System.out.println("enter a byte no:");
int b=sc.nextByte();
System.out.println("enter a short no:");
int c=sc.nextShort();
System.out.println("enter a long no:");
long d=sc.nextLong();
System.out.println("enter a float no:");
float e=sc.nextFloat();
System.out.println("enter a double no:");
double f=sc.nextDouble();
System.out.println("enter a boolean value:");
boolean g=sc.nextBoolean();

System.out.println("int no is:"+a);
System.out.println("byte no is:"+b);
System.out.println("short no is:"+c);
System.out.println("long no is:"+d);
System.out.println("float no is:"+e);
System.out.println("double no is:"+f);
System.out.println("boolean value is:"+g);


}
}