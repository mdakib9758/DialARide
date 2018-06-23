package com.hackercode.utilities;

public class SortRequest {
	Request r;
	public void sort(Request arr[]){
		r=new Request();
		for(int i=0;i<arr.length;i++){
			for (int j=i+1;j<arr.length;j++){
				if(arr[i].getEndTime()>arr[j].getEndTime()){
					r=arr[i];
					arr[i]=arr[j];
					arr[j]=r;
				}
			}
		}
		
	for(int i=0;i<arr.length;i++){
			System.out.println(""+arr[i]);
		}
	}
}
