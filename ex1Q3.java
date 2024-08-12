
package shahr;

public class ex1Q3 {
//	func to change the order of the array into zigZagTrio order 
	public static void zigZagTrio(int[] arr) {
		double divin3 = arr.length;
		divin3 = (divin3 / 3) * 10;
		if (divin3 % 10 != 0)
			System.out.println("1st doesnt div in 3");
//			checking if array doesn't div in 3
		else {
			int i = 0, temp = 0;
			while (i + 2 <= arr.length) {
//				swap places 1 and 3  every 3 places
				temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
				i += 3;
			}
		}
	}

// func to check if array 1 equals zigZagTrio order of array 2
	public static boolean isZigZagTrio(int[] Arr, int[] Brr) {
		boolean flag = true;
		double divin3 = Brr.length;
		divin3 = (divin3 / 3) * 10;
		if (divin3 % 10 != 0) {
			System.out.println("2nd doesnt div in 3");
//			 check if second array div in 3 (not necessary)
			flag = false;
			System.out.println(flag);
			return flag;
		}
		if (Arr.length != Brr.length) {
//			checking length equals of two arrays 
			flag = false;
			System.out.println(flag);
			return flag;
		}
		zigZagTrio(Arr);
//		turning first array into zigZagTrio order
		int i = 0;
		while (i < Arr.length) {
			if (Arr[i] != Brr[i]) {
				flag = false;
//				checking if equals chars in each array after new ordering 
			}
			i++;
		}
		System.out.println(flag);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 5, 6, 4 };
		int[] brr1 = { 3, 2, 1, 6, 5, 4, 4, 6, 5 };
		int[] arr2 = { 1, 2, 3 };
		int[] brr2 = { 3, 2, 1, 6 };

		isZigZagTrio(arr1, brr1);
		isZigZagTrio(arr2, brr2);

	}

}
