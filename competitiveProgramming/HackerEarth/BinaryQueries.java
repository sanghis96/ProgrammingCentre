import java.util.*;

class BinaryQueries 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        	arr[i] = sc.nextInt();
        for(int i=0; i<q; i++)
        {
        	if(sc.nextInt() == 1)
            	arr[sc.nextInt()-1] ^= 1;
            else
            {
            	String num = "";
            	int l = sc.nextInt();
            	int r = sc.nextInt();
            	for(int j=l-1; j<r; j++)
            		num += ""+arr[j];
            	if(binaryToDecimal(num)%2 == 0)
            		System.out.println("EVEN");
            	else
            		System.out.println("ODD");
            }
        }
    }
    private static long binaryToDecimal(String binary)
	{
		int len = binary.length();
        long num = 0;
        for(int i=len-1,j=0; i>=0; i--,j++)
        	num += Math.pow(2,j)*Integer.parseInt(""+binary.charAt(i));
        return num;
	}
}
