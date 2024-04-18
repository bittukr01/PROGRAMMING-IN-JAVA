
//find the greatest_no
import java.util.*;

public class Greatest_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = s.nextInt();
        System.out.println("Enter second Number : ");
        int num2 = s.nextInt();
        System.out.println("Enter third Number : ");
        int num3 = s.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Greatest number is: " + num3);
        } else {
            System.out.println(" All Equal");
        }
    }

}
