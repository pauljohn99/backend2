package com.orthofx;
import java.util.Scanner;
public class fruits {
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter fruit");
		String fruit=read.nextLine();
		switch(fruit)
		{
		case "apple":
			System.out.println("red");
			break;
		case "banana":
		System.out.println("yellow");
		break;
		default:
			System.out.println("green");
			break;
			
		}
		
	}
}
