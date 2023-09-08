package program;

import java.util.Scanner;

 class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number : - ");
		int n= sc.nextInt();
		int sum=0;
		int c=0;
		double avg=0;
		while(n!=0)
		{
			n=n%10;
			sum = sum+n;
			n=n/10;
			
		 
		 c++;
		}
		avg= sum/c;

		System.out.println(avg);

	}


}
