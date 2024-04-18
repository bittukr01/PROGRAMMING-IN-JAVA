import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number of subjects : ");

        int numGet = s.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numGet; i++) {
            System.out.println("Enter your marks obtained in each subject " + i + " : ");
            int marks = s.nextInt();
            totalMarks += marks;

            double avgPercentage = (double) totalMarks / numGet;

            String grade;
            if (avgPercentage >= 90) {
                grade = "O";
            } else if (avgPercentage >= 80) {
                grade = "A";
            } else if (avgPercentage >= 70) {
                grade = "B";
            } else if (avgPercentage >= 60) {
                grade = "C";
            } else if (avgPercentage >= 50) {
                grade = "D";
            } else {
                grade = "fail";
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + avgPercentage);
            System.out.println("Grade: " + grade);

            s.close();

        }
    }

}
