public class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] indices = {-1,-1};
        int flag = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
                if(nums[i]+nums[j] == target)
                {
                    indices[0] = i;
                    indices[1] = j;
                    flag = 1;
                    break;
                }
            if(flag == 1)
                break;
        }
        return indices;
    }
}