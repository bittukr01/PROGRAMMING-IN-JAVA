
public class Overloading {
    public int  sum(int x,int y){
        return(x+y);

    }
    public int sum(int x,int y, int z){
        return(x+y+z);
    }
    public double sum(double x, double y){
        return(x+y);
    }
    public static void main(String[] args) {
    Overloading o=new Overloading();
    System.out.println(o.sum(10,20));
    System.out.println(o.sum(10,60));
    System.out.println(o.sum(1.0,2.0));
}
    
}
