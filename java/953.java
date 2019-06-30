class Solution {
    int[] index = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        // int[] index = new int[26];
        for(int i =0;i < order.length();i++){
            index[order.charAt(i)-'a'] = i;
        }
        for(int i = 0;i < words.length-1;i++){
            if(sort(words[i],words[i+1]) == false){
                return false;
            }
        }
        return true;
    }
    public boolean sort(String a,String b){
        int l = Math.min(a.length(),b.length());
        for(int i = 0;i < l;i++){
            if(index[a.charAt(i)-'a'] < index[b.charAt(i)-'a']){
                return true;
            }else if(index[a.charAt(i)-'a'] > index[b.charAt(i)-'a']){
                return false;
            }
        }
        return a.length() <= b.length();
    }
}