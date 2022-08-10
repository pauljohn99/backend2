package com.orthofx;
import java.util.Scanner;
public class pyramidwhile {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter height of pyramid");
		int s=read.nextInt();
		int h=s+s-1;
		int i=0;
		int k=1;
		while(i<s)
		{
			int j=1;
			while(j<=h)
			{
				int n=(h-k)/2;
				if(j<=n || j>(n+k))
					System.out.print(" ");
					
					
				else
				
					System.out.print("*");
					
				j++;
			}
			System.out.println(" ");
			k=k+2;
			i++;		
			}
		}
		
	}


