class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer>map =new HashMap();
        int v = 0;
        for(char c:s.toCharArray()){
            int k = map.getOrDefault(c,0);
            if(k == 0){
                v ++;
                map.put(c,k+1);
            }else{
                v --;
                map.put(c,0);
            }
            
        }
        return v <= 1;
    }
}