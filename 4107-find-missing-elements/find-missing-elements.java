class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min =101,max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
            set.add(x);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }  
        }        
        return list;
    }
}