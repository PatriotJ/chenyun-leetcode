class Solution {
    public void wiggleSort(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int len = temp.length;
        int l = len % 2 == 1 ? len/2:len/2-1;
        len --;
        for(int i=0;i<temp.length;i++){
            nums[i] = i % 2 == 0 ? temp[l--]:temp[len--];
        }
        
    }
}