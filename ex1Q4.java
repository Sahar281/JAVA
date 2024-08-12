
package shahr;

import java.util.Random;
import java.util.Scanner;

public class ex1Q4 {
//	func to change from String into an array of Strings
	public static String[] StringToArr(String str1) {
		int counter = 0, i = 0;
		for (String str : str1.split(" ")) {
// 			split
			counter++;
//			count num of words made from one String
		}
		String[] arrayStrings = new String[counter];
		for (String str : str1.split(" ")) {
//			split
			arrayStrings[i] = str;
//			enter each Word into the array
			i++;
		}
		return arrayStrings;
	}

//	func to to get random word from array of Strings 
	public static String getRandomStringFromArray(String[] arr) {
		Random rand = new Random();
//		create new random object 
		int arraySize = arr.length;
//		create new int object in array size		
		int randomNum = rand.nextInt(arraySize);
//		create new int object equals random num from arraySize (rand-func)			
		return arr[randomNum];
	}

//	func to get random sentence from mat of Strings array 
	public static String getRandomSentence(String[][] matOfStrings) {
		String sentence = new String();
//		create new String object
		for (int i = 0; i < matOfStrings.length; i++) {
//			get random word from each array and enter to sentence one at a time  
			sentence = sentence.concat(getRandomStringFromArray(matOfStrings[i]) + " ");
		}
		return sentence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		crating objects 
		int i = 5, j;
//		creating two dimensional array of Strings with i rows 
		String[][] mat = new String[i][];
//		cerating array of Strings
		String[] sentences = new String[i];

		Scanner input = new Scanner(System.in);

		for (j = 0; j < i; j++) {
			System.out.println("please enter sentence");
			sentences[j] = input.nextLine();
//			receiving sentences
			mat[j] = StringToArr(sentences[j]);
//			entering into mat on thr j place String changed into array of strings 
		}
		System.out.println(getRandomSentence(mat));
//		print func on mat
		input.close();
	}
}
