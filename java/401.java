class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<String>();
        for(int i = 0;i < 12;i++){
            for(int j = 0;j <60;j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == num){
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");
                    sb.append(((j<10)?"0":"")+j);
                    ans.add(sb.toString());
                }
            }
        }
        return ans;
    }
}