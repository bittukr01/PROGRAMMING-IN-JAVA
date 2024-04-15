public class Student_Overload{
         public void marks(String Name,int Total){
            System.out.println("Name :" + Name + " " + "Total :" + " " + Total);
         }    
         public void marks(int Total, String Name){
            System.out.println("Total :" + Total + " " + "Name :" + Name );

         }
         public int marks(int Total1, int Total2){
            System.out.println("Total : " + (Total1+Total2));
            return(Total1+Total2);
         }
         public static void main(String[] args) {
            Student_Overload stdo=new Student_Overload();
            stdo.marks("Bittu",362);
            stdo.marks(366,"Ritik");
            stdo.marks(362,366);
         }
    
}
