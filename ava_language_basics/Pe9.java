package package1;

import java.util.Scanner;

	public class Pe9 
	
	{
	    public static void main(String[] args)
	   
	    {
	        Scanner scan =new Scanner(System.in);
	        String n= scan.nextLine();
	        

	   
	       char[] array = n.toCharArray();

	       for (int i = array.length-1; i>=0; i--)
	           System.out.print(array[i]);
	   }

	}


