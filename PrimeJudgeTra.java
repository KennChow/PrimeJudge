package com.ken;

import java.util.Scanner;

public class PrimeJudgeTra {

	public static void main(String[] args) 
	{	
	//�ж�һ�����Ƿ�������
		Scanner in = new Scanner(System.in);
		//һ��ֻ�ܱ�1���Լ���������ô��������
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
			System.out.println(num+"������");
		}
		else
		{
			System.out.println(num+"��������");
		}
		
		//
		
	}

}
