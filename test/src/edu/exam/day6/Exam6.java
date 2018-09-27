package edu.exam.day6;

import java.util.Arrays;

import edu.diaz.randomarray.ArrayLengthException;
import edu.diaz.randomarray.BuildRandomArray;

public class Exam6
{

	public static void main(String[] args) throws ArrayLengthException
	{
		// TODO Auto-generated method stub
		int[] arr_o = BuildRandomArray.getIntegerRandomArray(15);
		System.out.println(Arrays.toString(arr_o));
		int[] arr_c = Arrays.copyOfRange(arr_o, 1, arr_o.length - 1);
		System.out.println(Arrays.toString(arr_c));
		arr_c = selectionSort(arr_c);
		System.out.println(Arrays.toString(arr_c));
		int[] arr_r = new int[arr_c.length];
		for (int i = 0; i < arr_c.length; i++)
		{
			arr_r[i]=arr_c[arr_c.length-i-1];
		}
		System.out.println(Arrays.toString(arr_r));

	}

	public static int[] selectionSort(int[] arr)
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
		return arr;
	}
	

}
