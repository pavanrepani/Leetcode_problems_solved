class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int c = 0;
        int ans = 0;
        for(int x:nums){
            if(x==0) c++;
            ans = ans ^ x;
        }
        if(c==n) return 0;
        return ans!=0?n:n-1;
    }
}