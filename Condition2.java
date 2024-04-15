import java.util.*;
public class Condition2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        float a=sc.nextInt();
        System.out.println("Enter second number :");
        float b=sc.nextInt();
        System.out.println("Enter third number :");
        float c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Maximum number is " +a);
        }
        
        else if(a<b && c<b){
            System.out.println("Maximum number is " +b);
        }
        else{
            System.out.println("Maximum number is " +c);
        }
    }
}
