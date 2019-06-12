class Solution {
    public int hIndex(int[] citations) {
        int l = citations.length;
        int[] paper = new int[l+1];
        for(int c:citations){
            paper[Math.min(l,c)]++;
        }
        int k = l;
        for(int s = paper[l]; k > s;s+=paper[k]){
            k--;
        }
        return k;
    }
}