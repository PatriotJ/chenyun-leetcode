class Solution {
    // HashMap<String> map = new HashMap();
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }else{
            StringBuilder sb = new StringBuilder();
            int k = 0;
            String s = countAndSay(n-1);
            int l = s.length();
            for(int i = 0; i < l; i++){
                if(i == 0){
                    k ++;
                }else{
                    if(s.charAt(i) == s.charAt(i-1)){
                        k ++;
                    }else{
                        sb.append(k);
                        sb.append(s.charAt(i-1));
                        k = 1;
                    }
                }
            }
            sb.append(k);
            sb.append(s.charAt(l-1));
            return sb.toString();
        }
    }
}