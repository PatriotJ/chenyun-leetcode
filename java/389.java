class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(char c:s.toCharArray()){
            int k = map.getOrDefault(c,0);
            map.put(c,k+1);
        }
        for(char c:t.toCharArray()){
            int k = map.getOrDefault(c,0);
            if(k == 0){
                return c;
            }
            map.put(c,k-1);
        }
        return 'a';
    }
}