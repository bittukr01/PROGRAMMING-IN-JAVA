import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter your password....");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        if(num==1234)
        {
            System.out.println("Successfully....");
            System.out.println("Name : " + "Bittu Kumar");
			System.out.println("Age : " + "24");
			System.out.println("Address : " + "Chak Apsaid");
			System.out.println("Contact : " + "7061103736");
			System.out.println("Persuing : " + "BCA");
        }
        else{
            System.out.println("Sorry Wrong password.......");
        }
    }
    
}
