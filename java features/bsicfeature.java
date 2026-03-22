import java.util.*;
public class bsicfeature  
	{ 
			public static void main(String args[]) 
			{
				System.out.println("Enter any String");
				Scanner sc = new Scanner(System.in);
				String sample =  sc.nextLine();							 
		        System.out.println("Sample String:\n"+ sample);	 

		        String encoded  = Base64.getEncoder().encodeToString(sample.getBytes());
		 
		        System.out.println("Encoded String:\n"+ encoded);
		        	        		    
		 		byte[] actualByte = Base64.getDecoder().decode(encoded);
		 
		        String actualString = new String(actualByte);
		 
		        System.out.println("actual String:\n" + actualString);
			}
	}
