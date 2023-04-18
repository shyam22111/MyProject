package APIRequest;

import org.testng.annotations.Test;

public class FibnocciSeries {
	
//	
//	@Test
public void name() {
	
	int a= 0;
	int b=1;
	for(int i=0;i<20;i++) {
		
		if(i==0) {
			System.out.println(0);
		}
		
		int c = a+b;	
		System.out.println(c);
	
	   if(i >=1 ) {
			a=b;
			b=c;
	   }
		
	}

}
//	@Test
	public void PrNumber() {
		int n =22;
		
		int f =0;
		
		for(int i=0;i<n;i++) {
			if(n%2==0) {
				f=f+1;
			}
			
		}
		if(f>1) {
			System.out.println(n+" number is not prime");
		}
		else {
			System.out.println(n+ " number is prime");
		}
	}
	
	
//	@Test
	public void SwappingNumber() {
		int a=10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		
		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	@Test
	public void PallindromeNum() {
		int num ;
		int num1=0;
		int num2=13731;
		int temp=num2;
		
		while(num2>0) {
			num=num2%10;
			num1=(num1*10)+num;
			num2=num2/10;
			
		}
		if(num1==temp) {
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not pallindrome");
		}
	}

}
