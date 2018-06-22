package com.hackercode.utilities;

public class Car {
	private int carTime;
	private int capacity;
	private int location;
	private int revaneu;
	private int[]passengerloacation;
	public Car(){
		passengerloacation=new int[5];
		capacity=5;
	}
	public int getCarTime() {
		return carTime;
	}
	public void passengerLocationReset(){
		for(int i=0;i<10;i++){
			passengerloacation[i]=0;
		}
		
	}
	public void setCarTime(int carTime) {
		this.carTime = carTime;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public int getLocation() {
		return location;
	}
	public int getRevaneu() {
		return revaneu;
	}
	public int[] getPassengerloacation() {
		return passengerloacation;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setLocation(int location) {
		this.location = location;
		//System.out.println(location);
	}
	public void setRevaneu(int revaneu) {
		this.revaneu = revaneu;
	}
	public void setPassengerloacation(int[] passengerloacation) {
		this.passengerloacation = passengerloacation;
	}
	
	
}
