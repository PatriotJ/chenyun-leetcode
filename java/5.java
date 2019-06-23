class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int ans = 0;
        String S = "";
        int l = arr.length;
        for(int i = 0;i < l;i++){
            int lo = i-1,hi = i+1,tmp = 1;
            while(lo >= 0 && hi < l && arr[lo] == arr[hi]){
                lo --;
                hi ++;
                tmp += 2;
            }
            if(ans < tmp){
                S = s.substring(lo+1,hi);
                ans = tmp;
            }
            lo = i;
            hi = i+1;
            tmp = 0;
            while(lo >= 0 && hi < l && arr[lo] == arr[hi]){
                lo --;
                hi ++;
                tmp += 2;
            }
            if(ans < tmp){
                S = s.substring(lo+1,hi);
                ans = tmp;
            }
        }
        return S;
        
    }
}