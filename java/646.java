class Solution {
    public int findLongestChain(int[][] pairs) {
        int l =pairs.length;
        if(l == 0){
            return 0;
        }
        Arrays.sort(pairs,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                if(a[0] == b[0]){
                    return a[1]-b[1];
                }
                return a[0]-b[0];
            }
        });
        int ans = 1;
        int end = pairs[0][1];
        for(int i = 1;i < pairs.length;i++){
            if(pairs[i][0] > end){
                ans ++;
                end = pairs[i][1];
            }else{
                end = Math.min(end,pairs[i][1]);
            }
        }
        return ans;
    }
}