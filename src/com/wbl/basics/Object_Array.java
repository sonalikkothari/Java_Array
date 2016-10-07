package com.wbl.basics;

//this is an object array
 public class Object_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object_Array objarr = new Object_Array();
		
		objarr.printstringarr();                //String object
		
		objarr.printlaptopmake();				//class object
		
		
	}

	public void printstringarr() {
		String[] strarr = {"Whitebox-QA","Whitebox-UI","Innovapath-placement"};
	
		for (String str: strarr) {
			System.out.println(str);
		}
	}
	
	public void printlaptopmake() {
		
		Laptop[] laptoparr = new Laptop[4];
		
		for(int i=0;i<laptoparr.length;i++) {
			laptoparr[i] = new Laptop();
		}
		laptoparr[0].make = "HP";
		laptoparr[1].make = "MACBOOK-PRO";
		laptoparr[2].make = "DELL";
		laptoparr[3].make = "INTEL";
		
				for(int i=0;i<laptoparr.length;i++) {
			System.out.println(laptoparr[i].make);
			
		}
		
	}
		
		}
 
 /*			output
  Whitebox-QA
Whitebox-UI
Innovapath-placement
HP
MACBOOK-PRO
DELL
INTEL
*/
  

