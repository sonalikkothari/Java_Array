package com.wbl.basics;



public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayMulti twodimensarray = new ArrayMulti();
		twodimensarray.Array_two_dimen();
	}

	
	public void Array_two_dimen() {
		
		//Method 1:
		int[][] intarr = new int[2] [];    //declaration
		intarr [0] = new int [4];			//Initailisation
		intarr [1] = new int [2];
		
		intarr[0] [0] = 22;		
		intarr[0] [1] = 23;        //Assign values to intarr[0] []
		intarr[0] [2] = 24;
		intarr[0] [3] = 25;
		
		intarr[1] [0] = 50;			//Assign values to intarr[1][]
		intarr[1] [1] = 60;
		
		
		for(int i=0; i<intarr.length;i++) {
			for(int j=0;j<intarr[i].length;j++) {
				
				System.out.println(intarr[i][j]);
			}
		}
		//Method 2:
			int [] [] intarray2 = {{12,13,14,15},{150,160}};	//declare,initialize,assign values to an array
			
			for(int i=0; i<intarray2.length;i++) {
				for(int j=0;j<intarray2[i].length;j++) {
					
					System.out.println(intarray2[i][j]);		//print array values
				}
			}
							 
		//Method 3:
			int [][] intarr3 = new int[][] {{32,33,34,35},{250,260}};    //declare,initialize,assign values to an array
			
			for(int i=0; i<intarr3.length;i++) {
				for(int j=0;j<intarr3[i].length;j++) {			//print array values
					
					System.out.println(intarr3[i][j]);
				}
			}
			
		}
			
	}

/*    output
22
23
24
25
50
60
12
13
14
15
150
160
32
33
34
35
250
260
*/




