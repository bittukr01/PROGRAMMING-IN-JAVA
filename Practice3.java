import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two floating number...");  // To check the same up to three decimal place
        System.out.println("Enter first floating number ...");
        double num1=s.nextDouble();
        System.out.println("Enter second floating number...");
        double num2=s.nextDouble();

        num1=Math.round(num1*1000);
        num1=num1/1000;

        num2=Math.round(num2*1000);
        num2=num2/1000;

        if(num1==num2){
            System.out.println("They are same up to threee decimal place..");
        }
        else{
            System.out.println("They are different..");
        }
    }
    
}
