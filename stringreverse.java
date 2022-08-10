package com.orthofx;
import java.util.Scanner;
public class stringreverse {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter string");
		String str= read.nextLine();
		int l=str.length();
		char[] a=new char[100];
		
		for(int k=0;k<l;k++)
		{
	      a[l-k-1]=str.charAt(k);
			 
		}
		for(int i=0;i<l;i++)
		{
		System.out.print(a[i]);
			
		}
			
		
}}
