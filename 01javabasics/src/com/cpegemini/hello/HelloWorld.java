/**
 * 
 */
package com.cpegemini.hello;

/**
 * @author apathak8
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name=args[0]; //cmd line argument
		System.out.println("hello World!!!");
        
		int age= Integer.parseInt(args[1]);
	
		System.out.println("Hello "+name
				+"\n your age is: "+age);

	}

}
