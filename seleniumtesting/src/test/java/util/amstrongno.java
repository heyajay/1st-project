package util;

public class amstrongno {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int am=0;
		int rev=0;
		int temp=n;
		while(n!=0) {
			rev=n%10;
			n=n/10;
			am=am+(rev*rev*rev);
			
			}
		System.out.println(am);

	if(temp==am)
		System.out.println("it is amstrong");
	else 
		System.out.println("not a amstrong no");
	
}}
