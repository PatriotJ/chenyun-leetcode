class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = gas.length;
        if(l == 1){
            if(gas[0] < cost[0]){
                return -1;
            }
            return 0;
        }
        int start = 0;
        int i = 0;
        int g = 0;
        int c = 0;
        while(i < 2 * l- 1 && i - start < l){
            g += gas[i % l];
            c += cost[i % l];
            if(g < c){
                g = 0;
                c = 0;
                start = i + 1;
                i ++;
            }else{
                i ++;
            }
        }
        if(i - start == l){
            return start;
        }else{
            return -1;
        }
    }
}