class A{
    void message(){
        System.out.println("Welcome to my World");
    }
}
class B extends A{
    void message(){
        System.out.println("Hello World");
    }
}
public class Overriding2 {
    public static void main(String[] args) {
       

        B b=new B();
        b.message();
    }
    
}
