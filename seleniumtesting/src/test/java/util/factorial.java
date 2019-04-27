package util;

public class factorial {
	static int fac(int a) {
		if(a==0) 
		
			return 1;
		else
		return (a*fac(a-1));
	}

	public static void main(String[] args) {
		System.out.println(fac(5));
		// TODO Auto-generated method stub
//without recursion
	/*	int r=0;
int fact=1;
	if(r==0)System.out.println("fact is 0");
	else
	{
	for (int i = 1; i <=r; i++) {
	fact=fact*i;
	
		
	}
	System.out.println(fact);*/	
}
}