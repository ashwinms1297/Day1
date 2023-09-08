package day2;

import java.util.Scanner;

public class pattern3 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1) {
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//}
	
	
	public static void stringTest(String s) {
//		s.replace(’h’, ’s’);
		s.replace('h', 's');
		}
		public static void stringBuilderTest(StringBuilder s) {
		s.append("o");
		}
		public static void main(String args[]) {
		String s = "hell";
		StringBuilder sb = new StringBuilder("well");
		stringTest(s);
		stringBuilderTest(sb);
		System.out.println(s + sb);
		}
		}





