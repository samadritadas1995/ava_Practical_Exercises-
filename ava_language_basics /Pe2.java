import java.util.Scanner;
 
class Pe2
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x>20 && x<30  )
      {
         if ( x % 2 == 0 )
         System.out.println("Hello Jerry");
      else
         System.out.println("Hello Tom");
   }
   else System.out.println("Dont watch cartoon!!!!");
   }
}