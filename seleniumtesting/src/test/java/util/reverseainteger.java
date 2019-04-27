package util;

public class reverseainteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=1285245;
		/*int rev=0;
		while(r !=0){
		rev=rev*10+r%10;
			
		//rev=r%10+rev;//rev=rev*10+rev;
			r=r/10;
			
			
		}
		System.out.println(rev);*/
    String rr  =String.valueOf(r);
		StringBuffer dd=new StringBuffer(rr);
		
		System.out.println(dd.reverse());
		
	}

}
