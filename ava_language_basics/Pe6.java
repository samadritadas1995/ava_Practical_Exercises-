package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pe6 {

	public static void main(String[] args) throws IOException {
		  char m;
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter any alphabet:");
	        m = (char) bf.read();
	        if(m >= 97 && m <= 122)
	        {
	            System.out.println("Lower Case");
	        }
	        else if(m >= 65 && m <= 90)
	        {
	            System.out.println("Upper Case");
	        }
	        else if(m >= 48 && m <= 57)
	        {
	            System.out.println("Digit");
	        }
	        else if(m >= 33 && m <= 47 && m>=58 && m<=64 && m<=91 && m>=96 && m>=123 && m<=127)
	        {
	            System.out.println("Special Character");
	        }
		

	}

}
