import java.util.*;
public class Menu_driven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        System.out.println("Enter first number :");
        int x=sc.nextInt();
        System.out.println("Enter second number :");
        int y=sc.nextInt();
        System.out.println("Enter your choice " );
        System.out.println("1.Addition 2.Subtraction 3.Multiply 4.division 5.Modolus 6.Exist");
        option=sc.nextInt();
        switch(option){
            case 1:System.out.println("Addition of " + x + " and " + y + " is " +(x+y));
            break;
            case 2:System.out.println("Subtration of " + x + " and " + y + " is " +(x-y));
            break;
            case 3:System.out.println("Multiply of " + x + " and " + y + " is " +(x*y));
            break;
            case 4:System.out.println("Division of " + x + " and " + y + " is " + (x/y));
            break;
            case 5:System.out.println("Modolus of " + x + " and " + y + " is " + (x%y));
            break;
            case 6:System.out.println("Invalid"); this is the only one option for if there
            break;
        }
       
    }
    
}
