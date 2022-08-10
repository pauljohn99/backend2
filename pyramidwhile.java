package com.orthofx;
import java.util.Scanner;
public class pyramidwhile {
	public static void main(String[] args)
	{
    Scanner read=new Scanner(System.in);
	System.out.println("enter height of pyramid");
	int s=read.nextInt();
	int i=0,j=0,h,k=1;
	h=s+s-1;
	while(i<s)
	{
		while(j<=h)
		{
			int n=(h-k)/2;
		if(j<=n || j>(n+k))
			System.out.print(" ");
		else
			System.out.print("*");
		j=j+1;
	}
		System.out.println("  ");
		i=i+1;
		k=k+2;

}
	}
}
	
