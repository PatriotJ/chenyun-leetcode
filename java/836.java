class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int l1 = rec1[0],b1 = rec1[1],r1 = rec1[2],t1 = rec1[3];
        int l2 = rec2[0],b2 = rec2[1],r2 = rec2[2],t2 = rec2[3];

        return (Math.min(r1, r2) > Math.max(l1, l2) && 
                Math.min(t1, t2) > Math.max(b1, b2));  
    }
}