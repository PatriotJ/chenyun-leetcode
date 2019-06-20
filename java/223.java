class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C-A)*(D-B) + (G-E)*(H-F);
        
        int l = Math.max(A,E);
        int r = Math.min(C,G);
        int up = Math.min(D,H);
        int bot = Math.max(B,F);
        if(l >= r || up <= bot){
            return area;
        }
        return area - (r-l)*(up-bot);
    }
}