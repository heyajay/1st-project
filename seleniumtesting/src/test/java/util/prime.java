package util;

import java.util.Scanner;

public class prime {
	 public static void main(String args[])
	
	{		
		int temp=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	       // scan.close();
		for(int i=2;i<=num-1;i++)
		{
	           if(num%i==0)
		   {
		      temp=temp+1;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(temp==0) {
		   System.out.println(num + " is a Prime Number");}
		else {
		   System.out.println(num + " is not Prime Number");
	}   }}
