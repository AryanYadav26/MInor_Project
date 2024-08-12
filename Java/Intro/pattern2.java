import java.util.*;

//importjava.util.*;
public class pattern2

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
            //spaces
		    int spaces = 2*(n-i) ;
		    for(int j =1;j<=spaces;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		       }
		       System.out.println();
		    }
		//lower half
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
			//spaces
		    int spaces = 2*(n-i); 
		    for(int j =1;j<=spaces;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		       }
		       System.out.println();
		    
			}
		
		}
	}

	