public class Overloading1 {
    public void StudentId(String name, int roll_no){
        System.out.println("Name : " + name + " " + " Roll_no : " + roll_no);
    }
    public void StudentId(int roll_no, String name){
        System.out.println("roll_no : " + roll_no + " " + "Name : " + name);
    }
    public static void main(String[] args) {
        Overloading1 ol=new Overloading1();
         ol.StudentId("Bittu" ,24);
         ol.StudentId(32,"Bittu");
    }
    
}
