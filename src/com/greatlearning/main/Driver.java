package com.greatlearning.main;

import com.greatlearning.services.*;
import java.util.Scanner;

public class Driver {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Take number of companies to be entered as input
		
		System.out.println("enter the no of companies");
		int n = sc.nextInt();
		
		//Create 2 arrays to store stock prices and track the stock prices compared to yesterday
		
		double[] stock = new double[n];
		boolean[] rise = new boolean[n];
		
		//Take the user inputs to store in 2 arrays
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter current stock price of the company "+ (i+1));
			stock[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			rise[i] = sc.nextBoolean();
		}
		
		// Take user input and perform the corresponding operation
		int ch;
		
		/*create objects for each service and call the services as per choice entered
		 * 
		 */
		DisplayStock obj1 = new DisplayStock();
		DisplayCount obj2 = new DisplayCount();
		SearchStock obj3 = new SearchStock();
		
		do {
			// display choices to the user
			System.out.println("\n"+"\n");
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			
			// take input of the choice
			ch = sc.nextInt();
			
			// perform the operations according to the choice entered
			switch (ch){
				case 1: obj1.displayAsc(stock);
						break;
						
				case 2: obj1.displayDesc(stock);
						break;
						
				case 3: obj2.displayRise(rise);
						break;
						
				case 4: obj2.displayDecline(rise);
						break;
						
				case 5: System.out.println("enter the key value");
						double key = sc.nextDouble();
						obj3.search(stock, key);
						break;
						
				case 0: System.out.println("Exited successfully");
						break;
				
				default: System.out.println("Please enter correct choice");
						 break;
						
						
			}
		}while(ch!=0);

	}

}
