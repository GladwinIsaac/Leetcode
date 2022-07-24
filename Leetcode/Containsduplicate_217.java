package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Containsduplicate_217 {
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set=new HashSet<>();
		for (int integer : nums) {
			if(set.add(integer)!=true)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,1};
		Containsduplicate_217 cd=new Containsduplicate_217();
		System.out.println(cd.containsDuplicate(nums));
	}
	
	//Best Solution
	public boolean containsDuplicate1(int[] nums) {
	    Set<Integer> set = new HashSet<>(nums.length);
	    for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
	    return false;
	}
	
	/*Time complexity: O(n). We do search() and insert() for n times and each operation takes constant time.
	Space complexity: O(n). The space used by a hash table is linear with the number of elements in it.*/
	
	//My Solution
	/*public boolean containsDuplicate(int[] nums) {
		int a=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					a++;
					break;   
				}
			}
		}
		if(a>0)
			return true;
		else
			return false;
	}*/
}
