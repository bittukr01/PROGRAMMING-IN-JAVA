import java.util.*;
public class practice6 {
    public static void main(String[] args) {
        int n,m1,t=1,max;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers..");
        n=s.nextInt();
        System.out.println("Enter the number...");
        int m=s.nextInt();
       
        max=m;
        
        while(t<=n-1){
            
            if(max<m);
            max=m;
            t++;

        }
        System.out.println("Maximum element is " + max);


    }
    
}
