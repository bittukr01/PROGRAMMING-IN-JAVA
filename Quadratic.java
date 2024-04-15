import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        double a,b,c,r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value : ");
         a=sc.nextDouble();
        System.out.println("Enter second value : ");
         b=sc.nextDouble();
        System.out.println("Enter third value : ");
         c=sc.nextDouble();
         double result=b*b-4*a*c;

        if(result<0){
            System.out.println("Roots imiginary");
        }
        else if(result==0){
            System.out.println("Roots are Equal");
            r1=-b/2*a;
            r2=b/2*a;
            System.out.println(r1);
            System.out.println(r2);
        }
        else{
            System.out.println("Roots are unequal: ");
            r1=(-b+Math.sqrt(result))/(2*a);
            r2=(-b+Math.sqrt(result))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }
    }
    
}
