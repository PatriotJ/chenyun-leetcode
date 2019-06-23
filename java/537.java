class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] s1 = a.split("\\+|i");
        String[] s2 = b.split("\\+|i");
        int a1 = Integer.parseInt(s1[0]), a2 = Integer.parseInt(s1[1]),b1 = Integer.parseInt(s2[0]),b2 = Integer.parseInt(s2[1]);
        int r = a1 * b1 - a2 * b2;
        int v = a1*b2+a2*b1;
        return r + "+" + v + "i";
    }
}