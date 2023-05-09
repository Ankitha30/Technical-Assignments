package gcr;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		char st1[] = str1.toCharArray();
		char st2[] = str2.toCharArray();
		Arrays.sort(st1);
		Arrays.sort(st2);
		return new String(st1).equals(new String(st2));
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(), firstCharString="";
		String originalString = str;
		int q = in.nextInt();
		
		for (int i = 1; i<=q; i++) {  
			String dir = in.next(); 
			int r = in.nextInt();  
			
			if (dir.equalsIgnoreCase("L"))
				str = str.substring(r) + str.substring(0,r);
			else if (dir.equalsIgnoreCase("R"))
				str = str.substring(str.length()-r) + str.substring(0,str.length()-r);
			firstCharString+=str.charAt(0);
		}
		for (int i = 0; i<originalString.length()-q; i++)
			if (isAnagram(originalString.substring(i, i+q), firstCharString)) {
				System.out.println("Yes");
				System.exit(0);
			}
		System.out.println("No");
	}

}