package com.greatlearning.services;
import com.greatlearning.mergesort.*;


public class SearchStock {
	
	public void search(double[] stock, double key)
	{

		
		/* Sort the array and apply binary search for searching
		 * To sort, copy the original stock array to another temporary array 
		 * so that the original array remains unchanged
		 */
		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++)
			arr[i]=stock[i];
		
		// sort the copied array using merge sort
		MergeSort ms = new MergeSort();
		ms.mergeSort(0, size-1, arr);
		
		// Binary search algorithm
		int start =0;
		int end = size-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if (arr[mid]==key)
			{
				System.out.println("Stock of value "+ key+ " is present");
				return;
			}
			else if (arr[mid]>key)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
			
		}
		
		System.out.println("Value not found");
		return;
		
	}
	
}
	