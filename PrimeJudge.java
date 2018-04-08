package com.ken;

import java.util.Scanner;

public class PrimeJudgeTra {

	public static void main(String[] args) 
	{	
	//判断一个数是否是素数
		Scanner in = new Scanner(System.in);
		//一个只能被1和自己整除，那么它是素数
		int num = in.nextInt();
		boolean isPrime = true;
		if(num>1)
		{
			for(int i=2;i<Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		else
		{
			isPrime=false;
		}
		if(isPrime)
		{
			System.out.println(num+"是素数");
		}
		else
		{
			System.out.println(num+"不是素数");
		}
		
		//
		
	}

}
