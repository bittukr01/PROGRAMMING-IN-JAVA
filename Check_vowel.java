import java.util.Scanner;

public class Check_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet ");
        char ch=sc.next().charAt(0);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Constant");
        }
    }
    
}
