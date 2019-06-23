class Solution {
    public String getPermutation(int n, int k) {
        LinkedList<String> list = new LinkedList();
        int pos = n, mul = 1;
        String ans = "";
        for(int i = 1;i <= n;i++){
            list.add(i+"");
            mul *= i;
        }
        mul /= n--;
        while(n != 0){
            int v = (k-1) / mul;
            ans += list.remove(v);
            while(k > mul){
                k -= mul;
            }
            mul /= n--;
        }
        ans += list.poll();
        return ans;
    }  
}