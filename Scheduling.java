package com.hackercode.utilities;

import com.hackercode.constants.Constants;

public class Scheduling {
	public void schedule(Car car[],Request r[],int loc[][]){
		
		
		for(int i=0;i<r.length;i++){
			int carNumber=0;
			for(int k=0;k<car.length;k++){
				if(car[k].getCapacity()>0){
					carNumber=k;
				}
			}
			if(car[carNumber].getLocation()!=r[i].getSrc()){
				int srtDist=loc[((car[carNumber].getLocation())-1)][((r[i].getSrc())-1)];
				car[carNumber].setLocation(r[i].getSrc());
				car[carNumber].setCarTime(2*srtDist);
			}
			//wait car
			if(car[carNumber].getCarTime()<r[i].getSrtTime()){
				car[carNumber].setCarTime(r[i].srtTime);
			}
			//scheduling a request
			if(car[carNumber].getCapacity()!=0 && (car[carNumber].getCarTime()>=r[i].getSrtTime()) && car[carNumber].getCarTime()<=r[i].endTime){	
				car[carNumber].setRevaneu(car[carNumber].getRevaneu()+(loc[(car[carNumber].getLocation())-1][(r[i].getDest())-1]));
				car[carNumber].setCapacity(car[carNumber].getCapacity()-1);
				int []indeces=car[carNumber].getPassengerloacation();
				System.out.println(Constants.requestServed+r[i].getSrc()+" "+r[i].getDest()+" "+r[i].getSrtTime() +" "+r[i].getEndTime());
				for(int j=0;j<5;j++){
					if(indeces[j]==0){
						indeces[j]=r[i].getDest();
						break;
					}
				}
				car[carNumber].setPassengerloacation(indeces);
			}
			//drop passenger respective locations
			if(car[carNumber].getCapacity()==5){
				int []dropLocations=car[carNumber].getPassengerloacation();
				for(int j=0;j<dropLocations.length;j++){
					if(car[carNumber].getLocation()!=dropLocations[i]){
						int srtDist=loc[(car[carNumber].getLocation())-1][(dropLocations[i])-1];
						car[carNumber].setLocation(dropLocations[i]);
						car[carNumber].setCarTime(car[carNumber].getCarTime()+(2*srtDist));
					}
					car[carNumber].setCapacity(car[carNumber].getCapacity()-1);
					car[carNumber].passengerLocationReset();
				}
			}
		}
		
	}

}
