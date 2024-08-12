import java.util.*;
 class AOR{
    
    int length ;
    int breadth;
 }
 class Area {
    public static void main(String[] args) {
    int area;
    AOR R1=new AOR();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length and breath");
    R1.length = sc.nextInt();
    R1.breadth =  sc.nextInt();
    area=(R1.length * R1.breadth) ;
    System.out.print("Area is=" + area);
    }  
}
 