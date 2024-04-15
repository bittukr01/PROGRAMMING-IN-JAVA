import java.util.*;
public class Leap_Year {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year :");
        int x=sc.nextInt();
        boolean flag=false;
        if(x%400==0){
            flag=true;
        }
        else if(x%100==0){
            flag=false;
        }
        else if(x%4==0){
            flag=true;
        }
        else{
            flag=false;
        }
        if(flag){
            System.out.println("Year " +x+ " is a leap year");
        }
        else{
            System.out.println("Year " +x+ " is not a leap year");
        }
    }
    
}
