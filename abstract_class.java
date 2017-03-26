import java.io.*;

abstract class A
{
	abstract void method1();
	void disp()
	{
		System.out.println("this is normal method in the abstract class");
	}
}

class B extends A
{
	void method1()
	{
			System.out.println("abstract method called");

	}
}

class C 
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.method1();
		obj.disp();
	}
}