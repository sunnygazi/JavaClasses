package JavaAlgorithm;

public class ArrayFindMinValue2 {

	public static void main(String[] args) {
		
		int [] g= {2,4,6,8,10};
		int min = 12;
		int len = g.length;
		 	
		for(int i =0; i<len; i++) {
			if (g [i]<min)
				min=g[i];
			
			}
		
		System.out.println(min);
		

	}//end of main

}//end of class
