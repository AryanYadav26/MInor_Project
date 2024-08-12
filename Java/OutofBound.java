public class OutofBound {
        public static void main(String[] args) {
            // Initialize arrays for student names and roll numbers
            String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Ivy", "Jack"};
            int[] rollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    
            try {
                // Attempt to display the names and roll numbers of students
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Student " + (i + 1) + ":");
                    System.out.println("Name: " + studentNames[i]);
                    System.out.println("Roll Number: " + rollNumbers[i]);
                    System.out.println();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occurred. The program has been terminated.");
            }
        }
    }