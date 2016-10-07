package com.wbl.basics;

//This is a Single Dimensional array program
public class ArraySingle {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySingle arr = new ArraySingle();
		//arr.Test();
		arr.Array_Single_dimen();
	
	}

		public void Array_Single_dimen() {
			
			
			//Method 1:
			
			int[] numarray;   //Array Declaration
			
			numarray = new int[6]; 	//Initialise an array
			
			numarray[0] = 100;    //Assigning values to an array
			numarray[1] = 200;
			numarray[2] = 300;
			numarray[3] = 400;
			numarray[4] = 500;
			numarray[5] = 600;
			
		for(int j =0 ;  j< numarray.length;j++) {
			System.out.println( numarray[j]);     //printing  array values
		}
			
		//***************************************************************
		//Method 2:	
		
		long[] longarray = new long[10];   //array declaration and initialization
		
		for(int j =0 ;  j< longarray.length;j++) {  
			longarray[j] = j;							//assigning values to an array
		}
		
		for(int j =0 ;  j< longarray.length;j++) {
			System.out.println( longarray[j]);			//printing array values 
		}
		
		
		//**************************************************************************
		
		//Method 3: 					//anonymous way
		
		int[] numarray1 = new int[] {15,16,17,18};    //array declaration,initialization,assigning values
			
			for(int j =0 ;  j< numarray1.length;j++) {
				System.out.println( numarray1[j]);			//printing array values
			}
			
		//*********************************************************
			
			//Method 4 :
			
			int[] numarray2 =  {500,600,700,800};    //array declaration,initialization,assigning values
			
			for (int num2 : numarray2) {
				System.out.println(num2);  ///Enhanced for loop for printing array values	
			}
		
		}
	
	
		
}
///////////////////////output
/*100
200
300
400
500
600
0
1
2
3
4
5
6
7
8
9
15
16
17
18
500
600
700
800
*/