import java.util.Scanner;
class Ti
{
public static void main(String[] arr)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a int no:");
int a= sc.nextInt();
System.out.println("enter your name:");
String b=sc.next();
System.out.println("enter a char");
String s= sc.next();
char c=s.charAt(0);

System.out.println("int no is:"+a);
System.out.println("name is:"+b);
System.out.println("char is:"+c);
}
}