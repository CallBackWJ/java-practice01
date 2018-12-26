package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.print("Please enter a number:");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			for(int i=2;i<=num;i+=2)
			{
				sum+=i;
			}
		}
		else
		{
			for(int i=1;i<=num;i+=2)
			{
				sum+=i;
			}
	
		}
		System.out.println("result:"+sum);
			
	}
}
