public class Solution 
{
    public boolean isPalindrome(int x) 
    {
        long n=(long)x, rev=0;
		while(n > 0)
		{
			rev += n%10;
			rev *= 10;
			n /= 10;
		}
		if((long)x == rev/10)
			return true;
		else
			return false;
    }
}
