class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int l = s.length();
        if(l <= 2){
            return l;
        }
        Map<Character,Integer> map = new HashMap();
        // int dup = 1;
        // map.put(s.charAt(0),0);
        int ans = 1;
        int left = 0;
        for(int i = 0;i < l;i++){
            if(map.size()<3){
                map.put(s.charAt(i),i);
            }
            if(map.size() == 3){
                int min = l;
                for(int v:map.values()){
                    min = Math.min(min,v);
                }
                map.remove(s.charAt(min));
                left = min+1;
            }
            ans = Math.max(ans,i-left+1);
        }
        
        return ans;
    }
}