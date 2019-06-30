class Solution {
    public void duplicateZeros(int[] arr) {
        // LinkedList<Integer> list = new LinkedList();
        // for(int a:arr){
        //     list.add(a);
        //     if(a == 0){
        //         list.add(a);
        //     }
        // }
        // for(int i = 0;i < arr.length;i++){
        //     arr[i] = list.poll();
        // }
        int[] num = arr.clone();
        int j = 0;
        int i = 0;
        while(i < arr.length){
            arr[i++] = num[j];
            if(num[j] == 0 && i < arr.length){
                arr[i++] = num[j];
            }
            j++;
        }
    }
}