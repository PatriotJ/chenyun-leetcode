class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0;i < nums.length;i++){
            str[i] = nums[i] + "";
        }
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String a,String b){
                String v = a + b;
                String k = b + a;
                return k.compareTo(v);
            }
        });
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder s = new StringBuilder();
        for(String ss : str){
            s.append(ss);
        }
        return s.toString();
            
    }
}