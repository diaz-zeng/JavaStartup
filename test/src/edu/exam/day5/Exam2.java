package edu.exam.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.diaz.randomarray.ArrayLengthException;
import edu.diaz.randomarray.BuildRandomArray;
/**
 * 
 * �����������ҵ
 * @author Diaz
 *
 */
public class Exam2
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		try
		{

			int[] randomArray;
			System.out.println("�붨��һ������ĳ���");
			randomArray = BuildRandomArray.getIntegerRandomArray(new Scanner(System.in).nextInt());//��ȡһ���������
			System.out.print("���������ɣ�");
			for (int i : randomArray)//��ʾԭʼ����
			{
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("��ѡ��ѭ������:1.ѡ������\t2.ð������");
			switch (new Scanner(System.in).nextInt())//ѡ����������
			{
			case 1:
			{
				selectionSort(randomArray);
				break;
			}

			case 2:
			{
				bubbleSort(randomArray);
				break;
			}
			default://�쳣����������������˳�����
			{
				System.err.println("������󣬳����˳�");
				Thread.sleep(1000);//�߳����ߣ���ֹ��������Ϣ
				return;
			}
			}
		} catch (ArrayLengthException e)//�Զ�����쳣���񣬵��û���������鳤��С��1ʱ����
		{
			// TODO: handle exception
			e.printStackTrace();
		} catch (InputMismatchException e)//��ֹ�����ʽ��ƥ��
		{
			// TODO: handle exception
			System.err.println("������������������");
			main(args);
		}
	}

	/**
	 * 
	 * ѡ������
	 * @param arr Ҫ����ɸѡ ������
	 */
	public static void selectionSort(int[] arr)
	{

		for (int i = 0; i < arr.length; i++)
		{
			int temp = arr[i];
			for (int j = i; j < arr.length; j++)
			{
				if (temp > arr[j])
				{
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr)
		{
			System.out.print(i + "\t");
		}
	}

	
	/**
	 * ð������
	 * @param arr Ҫ����ɸѡ ������
	 */
	public static void bubbleSort(int[] arr)
	{

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 1; j < arr.length-i; j++)
			{
				int temp = 0;
				if (arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr)
		{
			System.out.print(i + "\t");
		}
	}

}
