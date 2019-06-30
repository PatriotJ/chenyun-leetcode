class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int l = nums.length;
        int[] ans = new int[l];
        if(a == 0){
            if(b >= 0){
                for(int i =0;i <l;i++ ){
                    ans[i] = b * nums[i] + c;
                }
                // return nums;
            }
            else{
                // int[] ans = new int[nums.length];
                for(int i = 0;i<l;i++){
                    ans[i] = b * nums[l-i-1] + c;
                }
            }
            return ans;
        }
        double mid = -1*(double)b / (2*a);
        double dif = Double.MAX_VALUE;
        int index = 0;
        for(int i = 0;i < l;i++){
            if(Math.abs(nums[i] - mid) < dif){
                dif = Math.abs(nums[i] - mid);
                index = i;
            }
        }
        int lo = index,hi = index+1;
        int i = 0;
        if(a > 0){
        while(lo >= 0 && hi < l){
            int k = nums[lo];
            int v = nums[hi];
            if(a*k*k + b * k < a *v*v+b*v){
                ans[i++] = a*k*k+b*k+c;
                lo --;
            }else{
                ans[i++] = a*v*v+b*v+c;
                hi ++;
            }
        }
        while(lo >= 0){
            int k = nums[lo];
            ans[i++] = a*k*k+b*k+c;
            lo --;
        }
        while(hi < l){
            int k = nums[hi];
            ans[i++] = a*k*k+b*k+c;
            hi ++;
        }
        }else{
            i = l-1;
            while(lo >= 0 && hi < l){
            int k = nums[lo];
            int v = nums[hi];
            if(a*k*k + b * k > a *v*v+b*v){
                ans[i--] = a*k*k+b*k+c;
                lo --;
            }else{
                ans[i--] = a*v*v+b*v+c;
                hi ++;
            }
        }
        while(lo >= 0){
            int k = nums[lo];
            ans[i--] = a*k*k+b*k+c;
            lo --;
        }
        while(hi < l){
            int k = nums[hi];
            ans[i--] = a*k*k+b*k+c;
            hi ++;
        }
        }
        return ans;
        
    }
}