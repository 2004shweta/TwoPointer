class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public int atMost(int[] nums ,int k){
         int r,l=0,count=0,oddcount=0;
         int n=nums.length;
         for(r=0;r<n;r++){
            if(nums[r]%2!=0){
                oddcount++;
            }
            while(oddcount>k){
                if (nums[l] % 2 != 0) {
                    oddcount--; 
                }
                l++;
            }
            count+=r-l+1;
         }
        return count;

    }
}
