class Solution {
    public int magicalString(int n) {
        if(n == 0){
            return 0;
        }
        if(n <= 3){
            return 1;
        }
        int[] magic = new int[n];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;
        int index = 2,ans = 1,next = 1;
        int count = magic[2];
        for(int i = 3;i < n;){
            while(count > 0 && i < n){
                if(next == 1){
                    ans ++;
                }
                magic[i++] = next;
                count --;
            }
            next = 3 - next;
            index++;
            count = magic[index];
        }
        return ans;
    }
}