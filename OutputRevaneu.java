package com.hackercode.utilities;

public class OutputRevaneu {
	public void writeOutput(Car car[]){
		int totalRevaneu=0;
		for(int i=0;i<car.length;i++){
			totalRevaneu+=car[i].getRevaneu();
		}
		System.out.println("total Revaneu="+totalRevaneu);
		
	}
}
