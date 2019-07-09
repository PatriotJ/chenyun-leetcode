class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = people.length;
        Arrays.sort(people);
        int lo = 0,hi = l-1;
        int ans = 0;
        while(lo <= hi){
            if(people[hi] + people[lo] <= limit){
                ans ++;
                hi --;
                lo ++;
            }else{
                ans++;
                hi --;
            }
        }
        return ans;
    }
}