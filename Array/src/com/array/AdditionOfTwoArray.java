package com.array;

public class AdditionOfTwoArray {
	public static void main(String[] args) {
		int a[][]= {{1,2,4},{1,3,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		int c[][]= new int[3][3];
			
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		}
		}		
	}


