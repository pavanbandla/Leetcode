package myleetcode;

import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	  	System.out.println(palin(str));
	}
	public static String palin(String str) {
		String result = "";
		for(int i = str.length()-1; i>=0;i--) {
			result = result + str.charAt(i);
		}
		if(result.equals(str)) {
		return str;
	}
		return "Not a palindrome";
	}
}

