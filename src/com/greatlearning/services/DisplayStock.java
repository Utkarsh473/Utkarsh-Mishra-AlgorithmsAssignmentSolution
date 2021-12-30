package com.greatlearning.services;
import com.greatlearning.mergesort.*;

public class DisplayStock {
	
	// function to display stocks in ascending order
	public void displayAsc(double[] stock)
	{
		/* copy the original stock array to another temporary array 
		 * so that the original array remains unchanged
		 */
		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++)
			arr[i]=stock[i];
		
		// sort the copied array using merge sort
		MergeSort ms = new MergeSort();
		ms.mergeSort(0, size-1, arr);
		
		// print the sorted array
		System.out.println("Stock prices in ascending order are :");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	// function to display stocks in descending order
	public void displayDesc(double[] stock)
	{
		/* copy the original stock array to another temporary array 
		 * so that the original array remains unchanged
		 */
		int size = stock.length;
		double[] arr = new double[size];
		for(int i=0;i<size;i++)
			arr[i]=stock[i];
		
		// sort the copied array using merge sort
		MergeSort ms = new MergeSort();
		ms.mergeSort(0, size-1, arr);
		
		// print the sorted array (print them in reverse order for descending order of array elements)
		System.out.println("Stock prices in descending order are :");
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
