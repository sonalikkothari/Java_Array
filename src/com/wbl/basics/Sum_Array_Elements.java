package com.wbl.basics;

//Sum of array elements
public class Sum_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Array_Elements addarr = new Sum_Array_Elements();
		addarr.printaddarray();
	}
		
	
	public void printaddarray() {
		int[] arr1 = {2,3,4,5};
		
		int result = 0;
		for(int i=0; i< arr1.length ;i++) {
			 result = result + arr1[i];
		}
			System.out.println("The result is:" + result);
	}
	
	
	
}

/*   output
The result is:14
*/