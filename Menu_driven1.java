import java.util.*;
public class Menu_driven1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press the 1 else 0 Buttom :");
        int input=sc.nextInt();
        
        if(input==1){
            do{
                System.out.println("Enter your marks :");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("This is good");
                }
                 if(marks<=89 && marks>=60){
                    System.out.println("This is also good");
                }
                if(marks<=59 && marks>=0){
                    System.out.println("This is good but marks does matter :");
                }while(input>0);
            }
            else{
                System.out.println("Now you can't input your marks");

            }
            
        }
        
    }
    
}
