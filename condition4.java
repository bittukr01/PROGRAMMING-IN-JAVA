import java.util.*;
public class condition4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int x=sc.nextInt();
        if(x%5==0){
            System.out.println("The number is divisible " );
        }
        else if(x%11==0){
            System.out.println("Number is divisible");
        }
        
        else{
            System.out.println("Number is not divisible ");
        }
    }
    
}
