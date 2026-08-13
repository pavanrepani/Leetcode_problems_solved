class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,r=0;
        int ans = 0;
        while(r<n){
            char cur = s.charAt(r);
            map.put(cur,map.getOrDefault(cur,0)+1);
            while(l<r && map.get(cur)>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}