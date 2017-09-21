package package1;

//import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Pe8 {
   public static void main(String[] args) {
       int num = 32;
       System.out.println("guess the number between 1 to 50");
       Scanner sc = new Scanner(System.in);
       int userNum = sc.nextInt();
       if(userNum > 1 && userNum < 50){
           do{
               if(userNum < num){
                   System.out.println("Number guessed is less than original number");
                   System.out.println("try another number");
                   userNum = sc.nextInt();
                   continue;
               }
               else if(userNum > num){
                   System.out.println("Number guessed is more than original number ");
                   System.out.println("try another number");
                   userNum = sc.nextInt();
                   continue;
               }

               else {
                   System.out.println("Number guessed matches the original number");
                   break;
               }
           }while(true);
       }
       else{
           System.out.println("invaild input");
       }
   }
}