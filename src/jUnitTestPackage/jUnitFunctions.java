package jUnitTestPackage;
import java.util.*;
public class jUnitFunctions 
{
	public static int AddNumbers(int a, int b)
	{
		return a+b;
	}
	public static String AddStrings(String st1, String st2)
	{
		return st1+st2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();int b=sc.nextInt();
		System.out.println("Enter 2 strings");
		sc.nextLine();
		String s1=sc.nextLine();String s2=sc.nextLine();
		System.out.println("The sum of 2 numbers is "+AddNumbers(a,b));
		System.out.println("The concatenated string is "+AddStrings(s1,s2));
		sc.close();
	}
}
