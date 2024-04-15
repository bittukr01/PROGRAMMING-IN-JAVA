import java.util.*;
public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter your choice :");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello");
            break;

            case 2:System.out.println("BYE");
            break;

            case 3:System.out.println("Good Night");
            break;
        }

    }
    
}
