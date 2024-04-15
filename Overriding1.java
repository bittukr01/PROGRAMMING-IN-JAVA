class Parent{
    public void m1(){
        System.out.println("From parent m1()");
    }
    public void m2(){
        System.out.println("From parent m2()");
    }
}
class Child extends Parent{
        public void m1(){
            System.out.println("From child m1()");
        }
        public void m2(){
            System.out.println("From child m2()");
        }
    }

 public class Overriding1 {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.m2();

        Parent obj2= new Child();
        
        obj2.m2();
    }
    
}
