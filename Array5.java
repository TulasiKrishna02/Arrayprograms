package com.Array.www;

import java.util.Arrays;

public class Array5 {
	public static void main(String args[])
	{
		int arr[]= {45,78,2,3,68,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int ele:arr)
		{
			System.out.println(ele);
		}

   
	}

}
