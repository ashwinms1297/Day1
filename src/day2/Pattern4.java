package day2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for( char i ='e';i>='a';i--) // logical to print n line 
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j); //logical to print 1 line 
			}
			System.out.println();
		}

	}

}
