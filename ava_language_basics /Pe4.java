import java.util.Scanner;

public class Pe4 {

   public static void main(String[] args)
       {

           Scanner sc=new Scanner(System.in); // for taking input

           System.out.println("Enter the number");
           int n = sc.nextInt();

           for (int i = 1; i <= n; i++)
           {
               for (int j = 1; j <= i; j++)
               {
                   System.out.print(i+" ");
               }


           }
       }
   }