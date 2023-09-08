package day3;

import java.util.Scanner;

public class countVCDS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		int vcount=0;
		int ccount=0;
		int dcount=0;
		int scount=0;
		char s[] =input.toCharArray();
		input = input.toLowerCase();
		for (char c : s) {
			if(Character.isLetter(c))
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			else if(Character.isDigit(c))
			{
				dcount++;
			}
			else
			{
				scount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
		System.out.println(scount);
		System.out.println(dcount);
		

	}

}
