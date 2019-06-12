class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>count = new HashMap();
        for(char c:s.toCharArray()){
            int k = count.getOrDefault(c,0);
            count.put(c,k+1);
        } 
        for(int i = 0;i < s.length();i++){
            if(count.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}