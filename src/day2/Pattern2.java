package day2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n+2;j++) {
//				if(j<=i||j>=n*2-i) {
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n*2;j++)
			{
				if(j<=i) {
					System.out.print("* ");
				}
				else if((n+2-i)<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
