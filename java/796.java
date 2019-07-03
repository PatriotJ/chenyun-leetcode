class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        String S =B+B;
        return S.indexOf(A) == -1 ? false:true;
    }
}