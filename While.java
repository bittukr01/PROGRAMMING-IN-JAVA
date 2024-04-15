import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        while(i<11){
            System.out.println("Table is " + x + "*" + i + "=" + x*i);
            i++;
        }
    }
    
}
