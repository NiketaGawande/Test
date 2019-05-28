package com.array;

import java.util.Arrays;

public class MergesTwoArray {
public static void main(String[] args) {
	int[] values= {10,20,30};
	int[] values1= {100,200,300};
	int[] merge=new int[values.length+values1.length];
	for(int i=0;i<values.length;i++) {
		merge[i]=values[i];
	}
	for(int i=0;i<values1.length;i++) {
		merge[i+values.length]=values1[i];
	}
	System.out.println(Arrays.toString(merge));
}
}
