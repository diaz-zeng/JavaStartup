package edu.exam.day4;

public class Exam1
{
	public static void main(String[] args)
	{
		System.out.println("ʹ��forѭ���ó��Ľ����"+doMathByForLoop());
		System.out.println("ʹ��do whileѭ���ó��Ľ����"+doMathByDoLoop());
		System.out.println("ʹ��whileѭ���ó��Ľ����"+doMathByWhileLoop());
		
	}
	public static int doMathByForLoop()
	{
		int result=1;
		for(int i =0 ;i<10;i++)
		{
			result*=i+1;
		}
		
		return result;
	}
	public static int doMathByDoLoop()
	{
		int result=1;
		int i=1;
		do
		{
			result*=i++;
		} while (i<=10);
		
		return result;
	}
	public static int doMathByWhileLoop()
	{
		int result=1;
		int i=1;
		while (i<=10)
		{
			result*=i++;
		}
		return result;
	}
}
