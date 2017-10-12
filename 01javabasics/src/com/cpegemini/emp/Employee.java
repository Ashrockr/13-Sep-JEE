/**
 * 
 */
package com.cpegemini.emp;

/**
 * @author apathak8
 *
 */
public class Employee {
	String empName;
	// local var name and instance var name can be same
   public static void main(String[] args) {
	//local variable-declare within the method/block
	   //must be initialize before used 
	   // cannot be declared as public or static
	     byte b; //by default private to the method
	     String empName="Smita";
	     short age=99;
	     float empSal=99.99F;
	//by default all decimal are treated as double in java
	     //thus all float literals must be appended with 'f'/'F'
	     long phone=9560347202;
	   //all long literlas must be appended with 'l'/'L'
         double d=9.9;
         char ch=65;//ascii value
         char grade='A';//wrapped with single code 
         char c1='\u0000';//default value of char
//local var does not have any default value
         boolean status="true";//no double code
         //only string literals must have double quotes
         System.out.println("\n__________________________________________"
         		          + "\n         Employee details                 "
         		          + "\n__________________________________________"
         		          + "\n       Employee ID         :"+b
         		          + "\n       Employee Name       :"+empName
         		          + "\n       Employee salary     :"+empSal
         		          + "\n__________________________________________"
         		          );
}
}
