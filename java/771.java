class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewel = new HashSet();
        for(int i=0;i<J.length();i++){
            jewel.add(J.charAt(i));
        }
        int ans = 0;
        for(int i=0;i<S.length();i++){
            if(jewel.contains(S.charAt(i))){
                ans ++;
            }
        }
        return ans;
    }
}