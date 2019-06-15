class Solution {
    public int minCost(int[][] costs) {
        // int[] last = new int[3];
        int[] cur = new int[3];
        int l = costs.length;
        if(l == 0){
            return 0;
        }
        int[] last = costs[0];
        for(int i=1;i<l;i++){
            cur[0] = Math.min(last[1],last[2])+costs[i][0];
            
            cur[1] = Math.min(last[0],last[2])+costs[i][1];
            cur[2] = Math.min(last[1],last[0])+costs[i][2];
            last[0] = cur[0];
            last[1] = cur[1];
            last[2] = cur[2];

        }
        return Math.min(Math.min(last[0],last[1]),last[2]);
    }
}