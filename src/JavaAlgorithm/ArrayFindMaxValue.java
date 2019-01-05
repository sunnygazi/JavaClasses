package JavaAlgorithm;

public class ArrayFindMaxValue {

	public static void main(String[] args) {
		int[] X = { 8, 6, 9, 110, 3, 9 };
		int max = 0;
		int len = X.length;

		for (int i = 0; i < len; i++) {
			if (X[i] > max)
				max = X[i];
		}

		System.out.println(max);

	}// end of main

}// end of class
