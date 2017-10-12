/**
 * 
 */
package com.capgemini.client;

import com.capgemini.date.MyDate;


/**
 * @author apathak8
 *
 */
public class DateCLient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyDate myDate = new MyDate();
     MyDate myDate1=new MyDate(13, 3, 2017);
     System.out.println("My date object is created"+myDate);
     System.out.println("My date object is created....."+myDate1);
     myDate1.setMonth(9);
     System.out.println("Month altered to..." + myDate1.getMonth());
     //new keyword does 3 task
     /*
      * 1>create object
      * 2>allocates memory for object on heap
      * 3>invoke constructor
      */
     
      
	}

}
