package edu.diaz.exam.day11;

import java.util.Scanner;

public class Exam1
{
	
	public static void main(String[] args)
	{
		System.out.println("�����룺");
		int inputNum = new Scanner(System.in).nextInt();
		StringBuilder stringBuilder = new StringBuilder(5);
		stringBuilder.append(inputNum);
		System.out.println("����Ϊ��"+stringBuilder.length()+"λ��");
		stringBuilder.reverse();
		for (int i = 0 ; i< stringBuilder.length();i++)
		{
			System.out.println(stringBuilder.charAt(i));
		}
	}
}
