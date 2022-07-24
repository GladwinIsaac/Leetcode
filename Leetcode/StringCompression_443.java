package leetcode.medium;

import java.util.Arrays;

public class StringCompression_443 {

	public static void main(String[] args) {
		//o/p - ["a","2","b","2","c","3"]
		char[] chars= {'a','a','b','b','c','c','c'};
		StringCompression_443 strcomp=new StringCompression_443();
		int index=strcomp.compress(chars);
		//chars = Arrays.copyOf(chars, index);
		System.out.println(Arrays.toString(Arrays.copyOf(chars, index)));
		
	}

	public int compress(char[] chars) {
		int index=0,i=0;
		int length=chars.length;
		while(i<length)
		{
			int j=i;
			while(j<length&&chars[j]==chars[i])
			{
				j++;//1//2
			}
			chars[index++]=chars[i];
			int count=j-i;//2
			if(count>1)
			{
				String count1=j-i+"";
				for (char c : count1.toCharArray()) {
					chars[index++]=c;
				}
			}
			i=j;
		}
		
		return index;
		
	}

	/*public int compress(char[] chars) 
	{
		int index=0,j=0;
		int length=chars.length;
		for(int i=0;i<length;i++)
		{
			i=j;
			for(j=i;j<chars.length;j++)
			{
				if(chars[i]!=chars[j])
				{
					break;
				}
			}

			if(index<length-1) {
				chars[index++]=chars[i];

				String count= j - i + "";
				for (char c : count.toCharArray()) {
					chars[index++]=c;
				}	
			}

		}

		return index;
	}*/


}
