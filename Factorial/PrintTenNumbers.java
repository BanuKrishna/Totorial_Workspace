package Factorial;
//import java.util.Scanner;
public class PrintTenNumbers {

	//without scanner
	public static void main(String args[])
	{
		int fact=1,num=10;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of 10 Numbers is: "+fact);
	}
}
	//with scanner
	/*public static void main(String[] args) {
		long n,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number");
		n=scan.nextLong();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact ="+fact);
		}
	}*/
