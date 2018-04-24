import pack.PackFirst;
import pack.subpack.PackSec;

class PackMainj
{
public static void main(String[] arr)
{
    PackSec obj=new PackSec();
	System.out.println(obj.multiplication(6,2));
	System.out.println(obj.div(6,2));
	
	PackFirst obj2=new PackFirst();
	System.out.println(obj2.sum(6,2));
	System.out.println(obj2.minus(6,2));
	

}
}