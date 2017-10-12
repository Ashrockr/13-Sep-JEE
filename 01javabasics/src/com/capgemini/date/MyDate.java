package com.capgemini.date;

public class MyDate {
	private int day;
	private int month;
	private int year;
	//step 5
	public MyDate(){
		System.out.println("MyDate no-arg Constructor....");
	}
	public MyDate(int day, int months, int year) {
		this.day = day;
		this.month = months;
		this.year = year;
	}
	//step7
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}

