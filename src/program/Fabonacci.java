package program;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length Of the Number");
		int n=s.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		int i=1;
		while(i<=n)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}

	}

}

