package edu.exam.day7.exam1;

public class TeacherTest
{
	public static void main(String[] args)
	{
		// ��������
		Teacher t = new Teacher();

		// Ϊ��������Ը�ֵ
		t.setName("George");
		t.setAge(30);
		t.setSalary(10000);

		// ������������
		System.out.println("name=" + t.getName());
		System.out.println("age=" + t.getAge());
		System.out.println("salary=" + t.getSalary());
		// ����ʹ�������ӵķ�����������Ӻ������
		t.increaseAge();
		System.out.println("new age=" + t.getAge());
	}
}
