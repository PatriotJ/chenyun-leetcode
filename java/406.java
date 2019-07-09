class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int l = people.length;
        List<int[]> list = new LinkedList();
        Arrays.sort(people,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0] == b[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        });
        for(int[] p:people){
            list.add(p[1],p);
        }
        int[][] ans = new int[l][];
        int i =0;
        for(int[] p:list){
            ans[i++] = p;
        }
        return ans;
    }
}