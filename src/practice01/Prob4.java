package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=null;
		System.out.print("Please enter a String:");
		str=sc.nextLine();
		char [] arr=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		
	}

}
