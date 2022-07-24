package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;



public class TwoSum_1 {

	
	    
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value=twoSum(new int[] {1,5,1,3}, 3);
		try {
			System.out.println(Arrays.toString(value));
				
		} catch (Exception e) {
			System.out.println(Arrays.toString(value));
		}
		
	}
	public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        
        
        for(int j=0;j<nums.length;j++)
        {
            int x=nums[j];
            int rem=target-x;
            if(hm.containsKey(rem))
            {
                int ind=hm.get(rem);
                if(ind==j) continue;
                return new int[]{j,ind};
                
            }
        
        }
        
   return new int[]{};
    }
}
