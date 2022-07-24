package leetcode.easy;

public class BestTimetoBuyandSellStock_leetcode_bruteforce {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,9,4};
		//int[] prices= {7,6,4,3,1};
		BestTimetoBuyandSellStock_leetcode_bruteforce bm=new BestTimetoBuyandSellStock_leetcode_bruteforce();
		System.out.println(bm.maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
		
		int largedifference=0;
		for(int buyday=0;buyday<prices.length;buyday++) {
			for(int sellday=buyday+1;sellday<prices.length;sellday++) {
				
				int currentdiff=prices[sellday]-prices[buyday];
				if(currentdiff>largedifference) {
					largedifference=currentdiff;
				}
			}
		}
		return largedifference;
		
	}
}
