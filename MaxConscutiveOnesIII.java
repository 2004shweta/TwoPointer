class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int maxzero=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0){
              maxzero++;
            }
            if(maxzero>k){
                if(nums[l]==0){
                    maxzero--;
                }
                l++;
            }
        }
        return r-l;
  }
}

// Time Complexity: 𝑂(𝑛)
// O(n), as each element is processed once.
// Space Complexity: 𝑂(1)
// O(1), as it only uses a few variables.
