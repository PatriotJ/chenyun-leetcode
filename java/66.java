class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer>l = new ArrayList();
        for(int i = digits.length-1;i>=0;i--){
            int x = digits[i] + carry;
            l.add(x % 10);
            carry = x / 10;
        }
        if(carry == 1){
            l.add(carry);
        }
        int[] ans = new int[l.size()];
        for(int i = 0;i < ans.length;i++){
            ans[i] = l.get(ans.length-i-1);
        }
        return ans;
    }
}