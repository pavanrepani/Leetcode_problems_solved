class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        while(j<n){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}