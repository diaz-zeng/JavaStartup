package edu.exam.day6;

import java.util.Scanner;

public class Exam2
{

	static boolean flag = false;

	static int[] a = {12,13,5,6,8,5};

	public static void main(String[] args)
	{
		System.out.println( "��������Ҫ��ѯ��Ԫ��ֵ");
		int target = new Scanner(System.in).nextInt();
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				flag = true;
				System.out.println(a[i]+"������ֵΪ��"+i);
			}
		}
		if(flag==false)
		{
			System.out.println("δ�ҵ���Ԫ��");
		}
	}

}
