package edu.diaz.exam.day5;
/**
 * @author Diaz
 *
 */
public class Exam1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] integers =new int[10];//��������
		for(int i = 0;i<10;i++)//�������
		{
			integers[i] = Integer.valueOf(i+1);
		}
		System.out.println(getMultiplyResultFromIntegerArray(integers));//���÷�������
		
	}
	/**
	 * ����������Ԫ����˲����ؽ��
	 * @param integers Ҫ���������
	 * @return ������
	 */
	public static int getMultiplyResultFromIntegerArray(int[] integers)
	{
		int result  = 1;
		for(int i = 0;i<integers.length;i++)
		{
			result*=integers[i];
		}
		return result;
	}

}
