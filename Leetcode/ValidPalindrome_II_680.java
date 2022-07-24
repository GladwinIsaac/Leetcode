package leetcode.easy;

public class ValidPalindrome_II_680 {

	public static void main(String[] args) {
		ValidPalindrome_II_680 vp=new ValidPalindrome_II_680();
		boolean a=vp.validPalindrome("abbca");
		System.out.println(a);
	}

	
	public boolean validPalindrome(String s) {
		
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				l++;
				r--;
			}
			else {
				return checkpalindrome(s,l+1,r)||checkpalindrome(s,l,r-1);
			}
		}
		return true;
        
    }
	
	private boolean checkpalindrome(String s, int l, int r) {
		
		while(l<r) {
			if(s.charAt(l)==s.charAt(r))
			{
				l++;
				r--;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	
}
