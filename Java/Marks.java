
import java.util.Scanner;
 import java.util.Arrays; 
class StuMark_6{
public static void main(String[] args){ Scanner sc = new Scanner(System.in); int[] marks;
String[] grades; int temp;
marks = new int[10]; grades = new String[10]; for(int i=0; i<10; i++){
System.out.print("Enter marks of Student" + (i + 1) + ":-");
marks[i] = sc.nextInt();
}
 
System.out.println("Marks in random order: ");
for(int i=0; i<10; i++){ System.out.print(+marks[i] + "\t"); System.out.print(" ");
}
Arrays.sort(marks); System.out.println("\n"); System.out.println("Marks in ascending order: ");
for(int i=0; i<10; i++) { System.out.print(+ marks[i] + "\t"); System.out.print(" ");
}
System.out.println("\n"); 
System.out.println("Marks with Grades are as follows: ");
for (int i=0; i<10; i++) {
if (marks[i]>0 && marks[i]<40){ grades[i] = "Fail";
}
else if (marks[i]>=40 && marks[i]<=50) { grades[i] = "PASS";
} else if (marks[i]>=51 && marks[i]<=75) { grades[i] = "MERIT";
} else if(marks[i]>75 && marks[i]<=100){ grades[i] = "DISTINCTION";
}
else if (marks[i]>100){
grades[i] = "Marks are not entered properly";
}
}
for (int j=0; j<10; j++) {
 
System.out.println(marks[j] + "\t" + grades[j]);
}
}
}
