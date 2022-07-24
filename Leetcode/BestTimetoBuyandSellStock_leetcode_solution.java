package leetcode.easy;

public class BestTimetoBuyandSellStock_leetcode_solution {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,9,4};
		BestTimetoBuyandSellStock_leetcode_solution bm=new BestTimetoBuyandSellStock_leetcode_solution();
		System.out.println(bm.maxProfit(prices));
	}
	public int maxProfit(int[] prices)
	{
		int minSoFar=Integer.MAX_VALUE,largedifference=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minSoFar) {
				minSoFar=prices[i];
			}
			else {
				largedifference=Math.max(largedifference, prices[i]-minSoFar);
			}
		}
		
		return largedifference;
	}
}
