class Solution {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int ans = 0;
        int x = squirrel[0],y = squirrel[1];
        int tx = tree[0],ty = tree[1];
        int dif = Integer.MIN_VALUE;
        for(int[] nut : nuts){
            ans += 2 * dist(tx,ty,nut[0],nut[1]);
            dif = Math.max(dif,dist(tx,ty,nut[0],nut[1])-dist(x,y,nut[0],nut[1]));
        }
        return ans - dif;
        
    }
    public int dist(int x,int y,int i,int j){
        return Math.abs(x-i) + Math.abs(y-j);
    }
}