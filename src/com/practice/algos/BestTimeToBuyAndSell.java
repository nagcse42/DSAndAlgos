package com.practice.algos;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		int prices[]= {1,2,3,4,5};
		System.out.println("profit is: "+getProfit(prices));
	}

	
	private static int getProfit(int prices[]) {
		int profit = 0;
		if(prices == null  || prices.length == 0) {
			return profit;
		}
		
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i+1] > prices[i]) {
				profit += prices[i+1] - prices[i];
			}
		}
		
		return profit;
	}
}
