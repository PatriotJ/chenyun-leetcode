class Solution {
    public int distributeCandies(int[] candies) {
        int l = candies.length;
        Set<Integer>candy = new HashSet();
        for(int i:candies){
            candy.add(i);
        }
        return Math.min(candy.size(),l/2);
    }
}