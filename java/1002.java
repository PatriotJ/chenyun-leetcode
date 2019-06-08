class Solution {
    
    public List<String> commonChars(String[] A) {
        int[] freq = new int[26];
        int[] comp = new int[26];
        for(char c:A[0].toCharArray()){
            freq[c-'a'] ++;
        }
        for(int i = 1;i<A.length;i++){
            for(char c:A[i].toCharArray()){
                comp[c-'a']++;
            }
            for(int j = 0;j < 26;j++){
                freq[j] = Math.min(freq[j],comp[j]);
                comp[j] = 0;
            }
        }
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                result.add(Character.toString((char)('a' + i)));
            }
        }
        return result;
        
    }
}