class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = left;i <= right;i++){
            if(selfD(i) == true){
                ans.add(i);
            }
        }
        return ans;
    }
    
    public boolean selfD(int num){
        for(char c:String.valueOf(num).toCharArray()){
            if(c == '0' || num % (c - '0') > 0){
                return false;
            }
}
        return true;
    }
}