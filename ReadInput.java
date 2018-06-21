package com.hackercode.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadInput {
		private int n,N,c,R;
		private int [][]location;
		private Car []car;
		private Request []req;
		public int getN() {
			return n;
		}
		public int getC() {
			return c;
		}
		public int getR() {
			return R;
		}
		public int[][] getLocation() {
			return location;
		}
		public Car[] getCar() {
			return car;
		}
		public Request[] getReq() {
			return req;
		}
		public void setN(int n) {
			this.n = n;
		}
		public void setC(int c) {
			this.c = c;
		}
		public void setR(int r) {
			R = r;
		}
		public void setLocation(int[][] location) {
			this.location = location;
		}
		public void setCar(Car[] car) {
			this.car = car;
		}
		public void setReq(Request[] req) {
			this.req = req;
		}
	
		public void reading() throws IOException{
				Scanner sr=new Scanner(new File("D:/softwares/input.txt"));
				n=sr.nextInt();
				N=sr.nextInt();
				c=sr.nextInt();
				R=sr.nextInt();
				//System.out.println(n);
				//System.out.println(N);
				location=new int[n][n];
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
					location[i][j]=sr.nextInt();
					if(location[i][j]==-1){
						location[i][j]=999;
					}
					System.out.print(location[i][j] +" ");
					}
					System.out.println();
				}
				car=new Car[N];
				for(int i=0;i<N;i++){
					car[i]=new Car();
				}
				
				for(int i=0;i<N;i++){
					//System.out.println(sr.nextInt());
					car[i].setLocation(sr.nextInt());
					
				}
				req=new Request[R];
				for(int i=0;i<R;i++){
					req[i]=new Request();
				}
				for(int i=0;i<R;i++){
					//System.out.println(sr.nextInt());
					req[i].setSrc(sr.nextInt());
					req[i].setDest(sr.nextInt());
					req[i].setSrtTime(sr.nextInt());
					req[i].setEndTime(sr.nextInt());
				}

		}
}