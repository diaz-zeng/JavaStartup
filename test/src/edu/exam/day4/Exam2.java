package edu.exam.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("������һ������");
		try
		{
			int inputNum = scanner.nextInt();
			int result = inputNum--;
			while (inputNum>=1)
			{
				result*=inputNum;
				inputNum-=1;
			}
			System.out.println("�˽�Ϊ��"+result);
		}
		catch (InputMismatchException e)
		{
			System.out.println("�����������������");
			Exam2.main(args);
		}
	}
}
