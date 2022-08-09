package com.orthofx;
import java.util.Scanner;
public class stringreverse {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter string");
		String reverse= read.nextLine();
		int i=reverse.length();
		String a;
		int b=0;
		char j;
		for(int k=i-1;k>0;k--)
		{
	 a.charAt(b)=reverse.charAt(k);
			 b++;
		}
		System.out.println("reversed string is" +a);
			
		}
			
		
}
