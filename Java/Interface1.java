import java.util.Scanner; 
interface test
{
int square(int n);
}
class arithmetic_17 implements test
{
public int square(int n)
{
return n*n;
}
}
class ToTestInt
{
public static void main(String args[])
{
System.out.print("enter a number"); 
Scanner sc=new Scanner(System.in); 
int n=sc.nextInt();
arithmetic_17 obj=new arithmetic_17(); 
System.out.println(obj.square(n));
}
}