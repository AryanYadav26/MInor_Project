import java.util.*;
public class largestof3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
        System.out.println("a is largest");}
        else if(b>c){
        System.out.println("b is largest");}
        else{
        System.out.println("c is largest");}
    }
}