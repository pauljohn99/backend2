package com.orthofx;
import java.util.Scanner;
public class marks {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter mark");
		int m=read.nextInt();
		if(m<=100)
		{
		if(m>=90)
			System.out.println("amazing");
		else if(m>=80)
			System.out.println("good");
		else if(m>=70)
			System.out.println("alright");
		else
			System.out.println("okay");
		}
		else
			System.out.println("invalid mark");
		
			
	}

}
