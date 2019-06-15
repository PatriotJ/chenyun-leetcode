class Solution {
    public String getHint(String secret, String guess) {
        int A = 0, B = 0;
        Map<Character,Integer> map = new HashMap();
        for(char c:secret.toCharArray()){
            int k = map.getOrDefault(c,0);
            map.put(c,k+1);
        }
        for(int i = 0;i < guess.length();i++){
            char c = guess.charAt(i);
            if(c== secret.charAt(i)){
                A ++;
            }
            int k = map.getOrDefault(c,0);
            if(k > 0){
                B++;
                map.put(c, k-1);
            }
        }
        B -= A;
        return A+"A"+B+"B";
    }
}