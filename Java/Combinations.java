import java.util.Scanner; 
class Combinations
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in); int num1,num2,num3;
System.out.print("Enter three numbers: ");
num1=sc.nextInt();
num2=sc.nextInt(); num3=sc.nextInt();
int[] arr={num1,num2,num3}; for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
for(int k=0;k<=2;k++)
{
if(i!=j&&j!=k&&k!=i)
{
System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
}}}}}}

