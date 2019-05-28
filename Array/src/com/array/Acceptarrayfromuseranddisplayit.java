package com.array;

import java.util.Scanner;

public class Acceptarrayfromuseranddisplayit {
public static void main(String[] args) {
	int[]z=new int[10];
	Scanner s =new Scanner(System.in);
	System.out.println("Emter 10 integers of array");
	for(int i=0;i<10;i++) {
		System.out.println("Enter array element");
		z[i]=s.nextInt();
	}
	System.out.println("You have entered");
	for(int i=0;i<10;i++) {
		System.out.println(z[i]);
	}
}
}
