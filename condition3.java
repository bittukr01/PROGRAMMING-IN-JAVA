import java.util.*;
public class condition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int x=sc.nextInt();
        
        if(x<0){
            System.out.println("Number is negative ");

        }
        else if(x>0){
            System.out.println("Number is positive ");
        }
        else{
            System.out.println("Equal to zero");
        }
    }
    
}
