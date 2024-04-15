import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value : ");
        double num1=s.nextDouble();
        if(num1>0){
            if(num1<1){
                System.out.println("Positive small number..");

            }
            else if(num1>1000000){
                System.out.println("Largest positive number...");
            }
            else{
                System.out.println("Positive number...");
            }    
        }
        else if(num1<0){
            if(Math.abs(num1)<1){
                System.out.println("Small negative number...");
            }
            else if(Math.abs(num1)<1000000){
                System.out.println("Largest small number...");

            }
            else{
                System.out.println("Negative number...");
            }
        }
        else{
            System.out.println("Zero");
        }

        
    }
    
}
