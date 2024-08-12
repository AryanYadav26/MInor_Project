import java.util.Scanner; class SquareSum_8{
public static void main(String[] args){ Scanner sc = new Scanner(System.in); int[] elements;
int[] square; int sum=0;
elements = new int[10]; square = new int[10]; for(int i=0; i<10; i++) {
 
System.out.print("Enter element no " + (i + 1) + ":-");
elements[i] = sc.nextInt();
}
for(int i=0; i<10; i++){ square[i]=elements[i]*elements[i];
}
for(int i=0; i<10; i++){ sum=sum+square[i];
}
System.out.println("Sum of squared elements in the array:" +sum);
}
}
