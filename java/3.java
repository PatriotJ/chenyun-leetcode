class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int ans = 0;
        for(int i = 0 ,j = 0; i < s.length() ; i++){
            
            int c = s.charAt(i);
            j = Math.max(arr[c],j);
            ans = Math.max(i - j + 1,ans);
            arr[c] = i + 1;
        }
        return ans;
    }
}