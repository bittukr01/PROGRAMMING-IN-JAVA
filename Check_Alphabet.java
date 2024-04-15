import java.util.Scanner;
public class Check_Alphabet {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("This is Alphabet " );
        }
        else{
            System.out.println("This is not Alphabet ");
        }
     }
    
}
