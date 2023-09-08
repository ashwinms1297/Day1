package program;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 number ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int gcd=0;
		for(int i=1;i<=x &&i <=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		int lcm =(x*y)/gcd;

		System.out.println(gcd); //hcf
		System.out.println(lcm); //lcm
	}


}
