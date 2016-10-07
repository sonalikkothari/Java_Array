package com.wbl.basics;

//Array of  primitive data types
public class Primitive_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primitive_Array primdata = new Primitive_Array();
		
		primdata.printbyte();
		primdata.printshort();
		primdata.printint();/////similar for long and double
		primdata.printfloat();
		primdata.printchar();
		primdata.printboolean();
	}

	
	public void printbyte() {
		byte[] bytearr = {120,121,122,123,124};
		
		for(int num : bytearr) {
			System.out.println(num);
		}
	}
	
	public void printshort() {
		short[] shortarr = {30000,32000};
		
		for(short num : shortarr) {
			System.out.println(num);
		}
	}
	
	public void printint() {
		int[] intarr = {1000,2000,3000,4000,5000};
		
		for(int num : intarr) {
			System.out.println(num);
		}
	}
	
	public void printfloat() {
		float[] floatarr = {22.5f,24.5f,27.5f};
		
		for(float num : floatarr) {
			System.out.println(num);
		}
	}
	
	public void printchar() {
		char[] chararr = {'W','H','I','T','E','B','O','X'};
		
		for(char ch : chararr) {
			System.out.println(ch);
		}
	}
	
	public void printboolean() {
		boolean [] booleanarr = {true,false};
		
		for(boolean num : booleanarr) {
			System.out.println(num);
		}
	}
	
}

/*     output
 120
121
122
123
124
30000
32000
1000
2000
3000
4000
5000
22.5
24.5
27.5
W
H
I
T
E
B
O
X
true
false
*/
