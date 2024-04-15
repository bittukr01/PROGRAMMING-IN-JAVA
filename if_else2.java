import java.util.Scanner;
public class if_else2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age.....");
        Scanner s=new Scanner(System.in);
        age=s.nextInt();

        if(age>=18)
        {
            System.out.println(" Congrats! You are eligible to vote.....");
        }
        else{
            System.out.println("Sorry! You are not eligible to vote..");
        }
    }
    
}
