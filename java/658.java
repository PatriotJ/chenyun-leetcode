class Solution {
    int x = 0;
    int k = 0;
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // binary search to find the closet number to x;
        // then expand
        // find the closest element and expand the range
        int closestIdx = 0;
        int i = 0;
        int j = arr.length - 1;
        while(i < j - 1){
            int mid = i + (j - i)/2;
            if(arr[mid] > x) j = mid; // mid can be valid, so keep mid
            else i = mid; // same as above, keep mid
        }
		
        // post-processing, i and j, which is the closest index?
        closestIdx = Math.abs(arr[i] - x) <= Math.abs(arr[j] - x) ? i : j;

        List<Integer> res = new ArrayList<>();
        int count = 0;
        i = closestIdx;
        j = closestIdx + 1;
        while(count < k){
            if(i < 0) j++;
            else if(j >= arr.length) i--;
            else if(Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) i--;
            else j++;
            count++;
        }
                    
        for(int m = i + 1; m <= j - 1; m++) res.add(arr[m]);
        return res;
    }
    
    
    
}