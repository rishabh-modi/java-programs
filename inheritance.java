import java.io.*;
import java.util.Scanner;

class student
{

		String name = "";
		String typeofinternship = "";
		String projectName ="";
		int bonus;
		int cgpa;

}

class func extends student
{
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the student");
		name = sc.nextLine();
		System.out.println("enter the type of internship of the student");;
		typeofinternship = sc.nextLine();
		System.out.println("enter the project name for the student");
		projectName = sc.nextLine();

		sc.nextLine();

		System.out.println("enter the CGPA of the student");
		cgpa = sc.nextInt();

		System.out.println("enter the bonus marks of the student");
		bonus = sc.nextInt();



	}

	void addgpa()
	{
		cgpa = cgpa + bonus;
	}

	void display()
	{
		System.out.println("");
		System.out.println("************** DETAILS OF THE STUDENT **************");
		System.out.println("name = " + name);
		System.out.println("typeofinternship = " + typeofinternship);
		System.out.println("project = " + projectName);
		System.out.println("CGPA = " + cgpa);

	}
}

class main1
{
	public static void main(String[] args)
	{
		func obj = new func();
		obj.getData();
		obj.addgpa();
		obj.display();
	}
}