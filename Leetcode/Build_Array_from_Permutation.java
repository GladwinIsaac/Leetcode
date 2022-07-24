package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;



public class Build_Array_from_Permutation {

	 public int[] buildArray(int[] nums) {
		 int n=nums.length;
	        int a[] = new int[n];
	        for(int i=0; i<n; i++){
	            a[i]= nums[nums[i]];
	        }
	        return a;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,2,1,5,3,4};
		Build_Array_from_Permutation b=new Build_Array_from_Permutation();
		int a[]=b.buildArray(nums);
		
		System.out.println(Arrays.toString(a));
		
	}

}
