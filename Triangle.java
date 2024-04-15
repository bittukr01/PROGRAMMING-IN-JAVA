import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three angles :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
    int sum=x+y+z;
        if(sum==180 && x>0 && y>0 && z>0)
        {
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");
        }
    }
    
}
