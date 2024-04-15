import java.util.Scanner;
public class Else {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter your marks..");
        Scanner r=new Scanner(System.in);
        marks=r.nextInt();

        if(marks>=60 && marks<=100){
            System.out.println("First");
        }
        else if(marks>=45 && marks<=60)
        {
            System.out.println("Second");
        }
        else if(marks>=33 && marks<=45){
            System.out.println("Third");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
