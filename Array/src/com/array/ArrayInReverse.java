package com.array;

public class ArrayInReverse {
public static void main(String[] args) {
	boolean[] values= {false,true,true,true};
	for(int i=values.length-1;i>=0;i--) {
		System.out.println(values[i]);
	}
}
}
