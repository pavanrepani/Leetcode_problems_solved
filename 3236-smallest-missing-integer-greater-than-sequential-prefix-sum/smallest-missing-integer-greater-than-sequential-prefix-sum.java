class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]+1 != nums[i]){
                break;
            }else{
                sum += nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums) set.add(x);
        if(!set.contains(sum)) return sum;
        while(true){
            sum += 1;
            if(!set.contains(sum)){
                return sum;
            }
        }
        // return 0;
    }
}