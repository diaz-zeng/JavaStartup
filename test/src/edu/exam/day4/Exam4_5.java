package edu.exam.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4_5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{

			Scanner scanner = new Scanner(System.in);
			int inputA, inputB, tempA, tempB, tempC;
			System.out.println("����ֵA��");
			inputA = scanner.nextInt();
			System.out.println("����ֵB��");
			inputB = scanner.nextInt();
			tempA = inputA > inputB ? inputA : inputB;
			tempB = inputA < inputB ? inputA : inputB;
			while (tempB != 0)
			{
				tempC = tempA % tempB;
				tempA = tempB;
				tempB = tempC;
			}
			System.out.println(inputA+"��"+inputB+"����С��Լ����"+tempA+",��С�������ǣ�"+inputA*inputB/tempA);

		} catch (InputMismatchException e)
		{
			// TODO: handle exception
			System.err.println("������������������!");
			main(args);
			return;
		}
	}

}

