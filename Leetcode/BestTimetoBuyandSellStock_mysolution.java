package leetcode.easy;

public class BestTimetoBuyandSellStock_mysolution {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,9,4};
		//int[] prices= {7,6,4,3,1};
		/*Output: 5
		 * a=4
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.*/
		
		BestTimetoBuyandSellStock_mysolution bs=new BestTimetoBuyandSellStock_mysolution();
		int a=bs.maxProfit(prices);
		System.out.println(a);
	}

	public int maxProfit(int[] prices) {
		
		//Iterate and subtract the element when the value is greater than the i
		
		int a=0,b=0;
		for(int i=0;i<prices.length-1;i++) {
			//{7,1,5,3,6,4};
			for(int j=i+1;j<prices.length;j++)
			{
				
				if(prices[j]>prices[i])
				{
					a=prices[j]-prices[i];
					if(a>b) {
						b=a;
					}
				}
				
			}
		}
		
		return b;
	}

}
