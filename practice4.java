import java.util.*;
public class practice4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int days_of_a_month=0;
       System.out.println("Enter month...");
       int month=s.nextInt();
       System.out.println("Enter year..");
       int year=s.nextInt();

       switch(month){
        case 1:System.out.println("January");
        days_of_a_month= 31;
        break;

        case 2: System.out.println("February");
        if((year%400==0)|| (year%4==0) && (year %100 !=0))
        days_of_a_month= 29;
        else{
            days_of_a_month= 28;
        }
        break;
        
        case 3:System.out.println("March");
        days_of_a_month= 31;
        break;

        case 4:System.out.println("April");
        days_of_a_month= 30;
        break;

        case 5:System.out.println("May");
        days_of_a_month= 31;
        break;

        case 6:System.out.println("June");
        days_of_a_month= 30;
        break;

        case 7:System.out.println("July");
        days_of_a_month= 30;
        break;

        case 8:System.out.println("August");
        days_of_a_month= 31;
        break;

        case 9:System.out.println("September");
        days_of_a_month= 30;
        break;

        case 10:System.out.println("October");
        days_of_a_month= 30;
        break;

        case 11:System.out.println("November");
        days_of_a_month= 30;
        break;

        case 12:System.out.println("December");
        days_of_a_month= 31;
        break;

       }
       System.out.println(month +" " + year + " " + "has"  + days_of_a_month);
        
    }
    
}
