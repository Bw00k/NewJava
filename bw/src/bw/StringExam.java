package bw;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));

		}

	}
}
