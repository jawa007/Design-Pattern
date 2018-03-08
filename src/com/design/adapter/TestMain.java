package com.design.adapter;

public class TestMain {
	public static void main(String[] args) {
		double ctc=850000.0;
		double salary=ctc/12;
		salary=salary+1;
		double basicSalary=(salary*35)/100;
		//System.out.println("ABP  "+181176/24792);
		System.out.println("Salary===>"+Math.round(salary));
		System.out.println("Basic Salary  "+Math.round(basicSalary));
		System.out.println("HRA  "+Math.round(basicSalary/2));
		System.out.println("QPlc==>"+basicSalary * 2.33);
		System.out.println("PF   "+Math.round(basicSalary*12)/100);
		System.out.println("Gratutuiy===>"+Math.round(basicSalary*5.31)/100);
	   // System.out.println("WBP "+181176/12);
	   // System.out.println("Additional Allownce==>"+24792/5344);
		//17.31
	}
	
	//135000
	
	
	
	
	//43200
	//806800
}
