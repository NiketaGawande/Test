package com.array;

public class Copyingarraytoanother {
public static void main(String[] args) {
	int array1[]= {2,3,4,5,8,9};
	int array2[]=new int[6];
	System.out.println("array");
	System.out.println();
	for(int i=0;i<array1.length;i++) {
		System.out.println(""+array1[i]);
	}
	System.out.println("\narray1:");
	for(int j=0;j<array1.length;j++) {
		array2[j]=array1[j];
		System.out.println("" +array2[j]);
	}
}
}
