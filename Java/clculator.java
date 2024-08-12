import java.util.*;
public class clculator {


    public static void main(String[] args) {
    int x;
    int y ; 
    int sum ; 
    float division;
    int multiply;
    int subtract; 
    Scanner sc=new Scanner( System.in);
    x=sc.nextInt();
    y=sc.nextInt();
    sum=x+y;
    subtract=x-y;
    multiply=x*y;
    division=x/y;
    System.out.println("sum = "+ sum);
    System.out.println(" subtract=" +subtract);
    System.out.println(" Multiply="+ multiply);
    System.out.println(" division =" +division );
    }
}

