package shahr;

import java.util.Scanner;

public class ex1Q2 {
//	getting avrage double number func 
	public static double getAverage(int[] grades) {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		double total = sum;
		double avg = total / grades.length;
		System.out.println(avg);
		return avg;
	}

//	checking symetry of numbers func 
	public static boolean isSymetric(int[] grades) {
		int under = 0;
		int over = 0;

		double avg = getAverage(grades);
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < avg) {
				under++;
			}
			if (grades[i] > avg) {
				over++;
			}
		}
		if (over == under) {
			System.out.println("is symetric");
			return true;
		} else
			System.out.println("not symetric");
		return false;
	}

//	checking mat symetrie func
	public static boolean isMatrixSymetric(int[][] grades) {
		for (int j = 0; j < grades.length; j++) {
			if (isSymetric(grades[j]) == false) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}

// geting mat from user func 
	public static void getMat() {
		System.out.println("enter mat");
		Scanner input = new Scanner(System.in);
		final int x = 3;
		int[][] mat = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.println("enter digit");
				mat[i][j] = input.nextInt();
			}
		}
		if (isMatrixSymetric(mat) == true) {
			System.out.println("symetric");
		} else
			System.out.println("not symetric");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[][] arr2 = { { 1, 2, 3, 4, 5 }, { 5, 6, 7, 17, 9 }, { 9, 10, 11, 12, 13 } };

		isSymetric(arr1);
		isMatrixSymetric(arr2);
		getMat();
	}

}