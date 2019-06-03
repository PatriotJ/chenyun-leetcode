class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = letters.length;
        
        if(letters[l-1] <= target){
            return letters[0];
        }
        int lo = 0,hi = l-1;
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(letters[mid] > target){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return letters[lo];
    }
}