package com.orthofx;
import java.util.Scanner;
public class pyramidfor {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter height of pyramid");
		int s=read.nextInt();
		int h=s+s-1;
		
		int k=1;
		for(int i=0;i<s;i++)
		{
			for(int j=1;j<=h;j++)
			{
				int n=(h-k)/2;
				if(j<=n || j>(n+k))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println(" ");
			k=k+2;
					
			}
		}
		
	}


