class Solution {
    public int lengthOfLastWord(String s) {
        String[] l = s.split(" ");
        if(l.length == 0){
            return 0;
        }
        int length = l.length;
        return l[length-1].length();
    }
}