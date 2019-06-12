class Solution {
    public String addBinary(String a, String b) {
        List<Integer> l = new ArrayList();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i >= 0 && j >= 0){
            int c = a.charAt(i) - '0';
            int d = b.charAt(j) - '0';
            int x = c + d + carry;
            l.add(x % 2);
            carry = x / 2;
            i --;
            j --;
        }
        while(i >= 0){
            int c = a.charAt(i) - '0';
            i --;
            int x = c + carry;
            l.add(x % 2);
            carry = x / 2;
        }
        while(j >= 0){
            int c = b.charAt(j) - '0';
            j --;
            int x = c + carry;
            l.add(x % 2);
            carry = x / 2;
        }
        if(carry == 1){
            l.add(1);
        }
        StringBuilder s = new StringBuilder();
        for(int o = l.size()-1;o >=0;o--){
            s.append(l.get(o));
        }
        return s.toString();
    }
}