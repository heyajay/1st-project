package util;

public class removejunkfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rr="@#$%^*()fghbjsn 2564(*&^%";
		rr=rr.replaceAll("[^a-zA-Z0-9]","");
System.out.println(rr);
	}

}
