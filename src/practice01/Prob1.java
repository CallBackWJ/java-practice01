package practice01;

import java.util.Scanner;


public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Please enter a number:");
		num=sc.nextInt();
		if(num%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
	}

}
