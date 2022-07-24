package leetcode.easy;

import java.util.Arrays;

public class ConcatenationArray_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,3,2,1};
		int arr[]=getConcatenation(num);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] getConcatenation(int[] nums) {
		
		int n=nums.length;
		int[] arr=new int[2*n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=nums[i];
			arr[i+n]=nums[i];
		}
		
		return arr;
        
    }
}
