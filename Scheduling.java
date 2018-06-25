package com.hackercode.utilities;

import com.hackercode.constants.Constants;

public class Scheduling {
	public void schedule(Car car[],Request r[],int loc[][]){
		
				if(car[0].getLocation()!=r[i].getSrc()){
				int srtDist=loc[((car[0].getLocation())-1)][((r[i].getSrc())-1)];
				car[0].setLocation(r[i].getSrc());
				car[0].setCarTime(2*srtDist);
			}
			//wait car
			if(car[0].getCarTime()<r[i].getSrtTime()){
				car[0].setCarTime(r[i].srtTime);
			}
			//scheduling a request
			if(car[0].getCapacity()!=0 && (car[0].getCarTime()>=r[i].getSrtTime()) && car[0].getCarTime()<=r[i].endTime){	
				car[0].setRevaneu(car[0].getRevaneu()+(loc[(car[0].getLocation())-1][(r[i].getDest())-1]));
				car[0].setCapacity(car[0].getCapacity()-1);
				int []indeces=car[0].getPassengerloacation();
				System.out.println(Constants.requestServed+r[i].getSrc()+" "+r[i].getDest()+" "+r[i].getSrtTime() +" "+r[i].getEndTime());
				for(int j=0;j<5;j++){
					if(indeces[j]==0){
						indeces[j]=r[i].getDest();
						break;
					}
				}
				car[0].setPassengerloacation(indeces);
			}
			//drop passenger respective locations
			if(car[0].getCapacity()==5){
				int []dropLocations=car[0].getPassengerloacation();
				for(int j=0;j<dropLocations.length;j++){
					if(car[0].getLocation()!=dropLocations[i]){
						int srtDist=loc[(car[0].getLocation())-1][(dropLocations[i])-1];
						car[0].setLocation(dropLocations[i]);
						car[0].setCarTime(car[0].getCarTime()+(2*srtDist));
					}
					car[0].setCapacity(car[0].getCapacity()-1);
					car[0].passengerLocationReset();
				}
			}
		}
		
	}

}
