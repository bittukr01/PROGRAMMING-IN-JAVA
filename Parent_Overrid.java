class Calculation{
    public int sum1(int x, int y){
        System.out.println("Add of two no : " + (x+y));
        return(x+y);
    }
    public int sum2(int x, int y){
        System.out.println("sub of two no : " + (x-y));
        return(x-y);
    }
}
class MiniChild extends Calculation{
    public int sum1(int x, int y){
        System.out.println("Add of two no : " + (x+y));
        return(x+y);

    }
    public int sum2(int x, int y){
        System.out.println("mul of two no : " + (x*y));
        return(x*y);
    }
}
public class Parent_Overrid {
   
        public static void main(String[] args) {
            Calculation p=new Calculation();
            p.sum2(50,20);

            Calculation ch=new MiniChild();
            ch.sum2(50,20);
        }
    }
    

