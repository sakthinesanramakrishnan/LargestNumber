package com.edu;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c,d,e, largest;
		a=10;
		b=20;
		c=50;
	    d=5;
	    e=9;
	    largest=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:(d>a && d>b && d>c)?d:(e>a && e>b && e>c && e>d)?e:d;
		System.out.println("Largest of "+a+" and "+b+" and "+c+" and "+d+" and "+e+" is "+largest);

	}

}
