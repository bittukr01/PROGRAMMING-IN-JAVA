import java.util.*;
public class Variables2 {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println(" greater");
        }
        else{
            System.out.println("lesser");
        }
    }
    
}
