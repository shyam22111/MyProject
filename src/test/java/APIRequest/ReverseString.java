package APIRequest;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
     public void reverse() {
    	 
    	 
    	 String s = "shyam";
    	 
    	 String s1="";
    	 for(int i=s.length()-1; i>=0;i--) {
    		 
    		 s1=s1+s.charAt(i);

    	 }
    	 System.out.println("Reverse String is :"+s1);
     }
     
}
