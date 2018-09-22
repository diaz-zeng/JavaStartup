package edu.diaz.randomarray;

/**
 * ��������������
 * 
 * @author zly98
 *
 */
public class BuildRandomArray
{
	/**
	 * һ��Ԫ���������Ϊʮ��int����
	 * @return �������
	 */
	public static int[] getIntegerRandomArray()
	{
		int[] result = new int[10];
		for (int i = 0; i < 10; i++)
		{
			result[i] = (int) (Math.random() * 100);
		}
		return result;
	}
	/**
	 * ����һ��Ԫ����������Զ�����������
	 * @param arrayLength ����ĳ���
	 * @return �������
	 * @throws ArrayLengthException ���鳤��С��1
	 */
	public static int[] getIntegerRandomArray(int arrayLength) throws ArrayLengthException
	{
		if(arrayLength>0) {
			int[] result = new int[arrayLength];
			for (int i = 0; i < result.length; i++)
			{
				result[i] = (int) (Math.random() * 100);
			}
			return result;
		}
		else
		{
			throw new ArrayLengthException();
		}
		
	}
}


