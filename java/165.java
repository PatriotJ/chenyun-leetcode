class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        if(s1.length < s2.length){
            return -1*compareVersion(version2,version1);
        }
        // System.out.println(s2.length);
        for(int i = 0;i < s2.length;i++){
            // System.out.println(s1[i]+s2[i]);
            int a = Integer.parseInt(s1[i]),b = Integer.parseInt(s2[i]);
            if(a > b){
                return 1;
            }else if(a < b){
                return -1;
            }
        }
        for(int j = s2.length;j < s1.length;j ++){
            int a = Integer.parseInt(s1[j]);
            if(a > 0){
                return 1;
            }
        }
        return 0;
    }
}