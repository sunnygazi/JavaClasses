package JavaAlgorithm;

public class ArrayFindMinValue {

	public static void main(String[] args) {
		int[] X = { 8, 6, 9, 17, 3, 9 };
		int min = 20;
		int len = X.length;

		for (int i = 0; i < len; i++) {
			if (X[i] < min)
				min = X[i];

			System.out.println(min);

		} // end of for loop

	}// end of main

}// end of class
