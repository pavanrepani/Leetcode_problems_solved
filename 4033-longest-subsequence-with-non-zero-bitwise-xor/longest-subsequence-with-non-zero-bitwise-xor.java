class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int ans = 0;
        for(int x:nums){
            sum += x;
            ans = ans ^ x;
        }
        if(sum==0) return 0;
        return ans!=0?n:n-1;
    }
}