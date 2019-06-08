class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] S = new char[n];
        Set<Character> vowel = new HashSet();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        int lo = 0,hi = n-1;
        while(lo <= hi){
            if(!vowel.contains(s.charAt(lo))){
                S[lo] = s.charAt(lo);
                lo ++;
                continue;
            }
            if(!vowel.contains(s.charAt(hi))){
                S[hi] = s.charAt(hi);
                hi --;
                continue;
            }
            S[hi] = s.charAt(lo);
            S[lo] = s.charAt(hi);
            lo ++;
            hi --;
        }
        StringBuilder ans = new StringBuilder();
        for(char c:S){
            ans.append(c);
        }
        return ans.toString();
    }
}