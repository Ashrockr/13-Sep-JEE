/**
 * 
 */
package com.cpegemini.trainee;

import com.capgemini.date.MyDate;

/**
 * @author apathak8
 *
 */
public class TraineeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args){
			  trainee trainee3=new trainee();
			  MyDate dob= new MyDate(13, 9, 1997);
			  trainee trainee2 =
			  new trainee( "Zara", "Khan", 9560347202L,"zara@gmail.com",dob);
			  System.out.println("trainee 2 : \n" + trainee2);
			  
		  }
	}


