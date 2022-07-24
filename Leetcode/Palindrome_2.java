package leetcode.easy;

public class Palindrome_2 {
	public static boolean isPalindrome(int x) {
		
		if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
		
        int rev=0;
        while(x>rev)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
		return x==rev||x==rev/10;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pal=isPalindrome(121);
		System.out.println(pal);
	}
		
}
