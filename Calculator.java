import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int x = scan.nextInt();

        System.out.println("Enter second number :");
        int y = scan.nextInt();

        int sum = x + y;
        int sub = x - y;
        int multiply = x * y;
        int div = x / y;
        int mod = x / y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice :");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(multiply);
                break;
            case 4:
                System.out.println(div);
                break;
            case 5:
                System.out.println(mod);
                break;

        }
    }

}
