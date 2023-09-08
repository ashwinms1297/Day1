package day3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ashwunccggdysxnxgnxm";
		String str="";
		
		String news = removeDuplicate(s);
		System.out.println(news);

	}

	private static String removeDuplicate(String str) {
		
		char[] ca=  str.toCharArray();
	LinkedHashSet<Character> ch = new LinkedHashSet();
		for (Character c : ca) {
		ch.add(c);
		}
		 StringBuilder sb = new StringBuilder();
	        for (char cha: ch) {
	            sb.append(cha);
	        }

	        return sb.toString();
		
	}

}
