import java.util.Scanner; 

public class if_else3 {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name....");
        Scanner t=new Scanner(System.in);
        name=t.nextLine();

        if(name=="Bittu")
        {
            System.out.println("Congrats! found on database...");
        }
        else{
            System.out.println("Sorry! not found...");
        }
    }
    
}
