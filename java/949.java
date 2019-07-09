class Solution {
    public String largestTimeFromDigits(int[] A) {
        int largest = -1;
        for(int i = 0;i<4;i++){
            for(int j = 0;j < 4;j++){
                if(i != j){
                    int hr = A[i]*10+A[j];
                    if(hr >= 24){
                        continue;
                    }
                    for(int k = 0;k < 4;k++){
                        if(k != i && k!=j){
                            int l = 6-k-i-j;
                            int min = 10 * A[k] + A[l];
                            if(min < 60){
                                largest = Math.max(largest,60*hr+min);
                            }
                        }
                    }
                }
            }
        }
        return largest >= 0? String.format("%02d:%02d", largest / 60, largest % 60) : "";
    }
    
}