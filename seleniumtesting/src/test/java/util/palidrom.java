package util;

public class palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0;int a ;int temp=0;  
		    int n=1051;//It is the number to check armstrong  
		  int t=n;  
		    while(n>0)  
		    {  
		    a=n%10;
		    c=(c*10)+a;
		    n=n/10;  
		      
		    }
		    System.out.println(c);
		    if(t==c)  
		    System.out.println("pali number");   
		    else  
		        System.out.println(" not a pali number");   
		   }  
		
	}

