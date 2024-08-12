
package shahr;

import java.util.Scanner;

public class Ex1 {
//	checcking if every digit in first array shows teice in order in second array
	public static boolean isTwice(String str1, String str2) {
		boolean flag = false;
		int j = 0;
		for (int i = 0; i < str2.length() && j < str1.length(); i++) {
			if (str1.charAt(j) == str2.charAt(i) && str1.charAt(j) == str2.charAt(i + 1)) {
//				checcking if every digit in first array shows teice in the second array
				j++;
				if (str1.length() == j)
					flag = true;
			}
		}
		System.out.println(flag);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("plese enter 2 strings");

		System.out.println("first: ");
		String str1 = input.nextLine();
		System.out.println("second: ");
		String str2 = input.nextLine();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		isTwice(str1, str2);
		input.close();
	}
}