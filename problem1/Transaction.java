package com.gl.problem1;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transacation array");
		
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("Enter the values of array");
		
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo=sc.nextInt();
		
		for(int i=0;i<targetNo;i++) {
			System.out.println("Enter the value of target"+(i+1));
			long target=sc.nextLong();
			int flag=0;
			long sum=0;
			
			for(int j=0;j<size;j++) {
				sum+=array[i];
				if(sum>=target) {
					System.out.println("Target achieved after "+(j+1)+" transactions");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Given target is not found");
			}
		}


	}

}
