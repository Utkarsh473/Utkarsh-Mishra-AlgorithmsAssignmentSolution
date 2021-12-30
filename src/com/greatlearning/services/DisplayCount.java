package com.greatlearning.services;

public class DisplayCount {
	
	// function to display the total number of companies for which stock rose
	public void displayRise(boolean[] rise)
	{
		int total = 0;
		for (int i=0;i<rise.length;i++)
		{
			// calculate the total companies for which stocks rose
			if(rise[i]==true)
				total++;
		}
		// print the output
		System.out.println("Total no of companies whose stock price rose today : "+ total);
	}

	// function to display the total number of companies for which stock declined
	public void displayDecline(boolean[] rise)
	{
		int total = 0;
		for (int i=0;i<rise.length;i++)
		{
			// calculate the total companies for which stocks declined
			if(rise[i]==false)
				total++;
		}
		// print the output
		System.out.println("Total no of companies whose stock price rose today : "+ total);
	}

}
