class Solution {
    public int[][] highFive(int[][] items) {
        int l = items.length;
        if(l == 0){
            return items;
        }
        Arrays.sort(items,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return b[1] - a[1];
                }
                return a[0]-b[0];
            }
        });
        ArrayList<int[]> list = new ArrayList();
        int sum = items[0][1];
        int count = 1;
        for(int i = 1;i<l;i++){
            if(items[i][0] == items[i-1][0]){
                if(count < 5){
                    sum += items[i][1];
                    count ++;
                }
            }else{
                list.add(new int[]{items[i-1][0],sum/count});
                sum = items[i][1];
                count = 1;
            }
        }
        list.add(new int[]{items[l-1][0],sum/count});
        return list.toArray(new int[list.size()][]);
    }
}