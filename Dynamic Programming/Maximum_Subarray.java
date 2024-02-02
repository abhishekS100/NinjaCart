


public class Maximum_Subarray{
    public int maxSubArray(int[] nums) {
       int lmax=nums[0];
       int gmax=nums[0];
       for(int i=1;i<nums.length;i++){
           lmax=Math.max(nums[i],lmax+nums[i]);
           gmax=Math.max(lmax,gmax);
       } 
       return gmax;
    }
}