/***
 * 
 * @author daanish ali
 *
 */
import java.util.Scanner;

public class assigngrades {
  public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("How many grades would you like to enter? "); 
    int numStudents = input.nextInt();

    int[] grades = new int[numStudents];
    int best = 0;
     System.out.println("Enter your grades: ");
    for (int counter = 0; counter < numStudents; counter++)
    {
        int grade = input.nextInt();
        grades[counter] = grade;
    }
    for (int i = 0; i < grades.length; i++)
    {
    if (grades[i] > best)
    best = grades[i];

    }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= best - 10)
             System.out.println("Student grade: A");
            else if (grades[i] >= best - 20)
            System.out.println("Student grade: B");
            else if (grades[i] >= best - 30)
             System.out.println("Student grade: C");
            else if (grades[i] >= best - 40)
           System.out.println("Student grade: D");
            else
            System.out.println("Student grade: F");

      }
  }
}