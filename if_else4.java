import java.util.Scanner;
public class if_else4 {
    public static void main(String[] args) {
        System.out.println("Enter any number to check :");
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        if(num>0)
        {
            System.out.println("Positive Number");
        }
        else if(num<0){
            System.out.println("Negative ");
        }
        else if(num==0)
        {
            System.out.println("zero");
        }
        
    }
    
}
