import java.util.Scanner;
public class nested_if {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter number: ");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
         
        if(x>y && y>z)
        {
            if(y>z)
            {
                System.out.println(x);
            }
            else{
                System.out.println(y);
            }
        }
        if(y>z && z>x)
        {
            System.out.println(z);
        }
    }
    
}
