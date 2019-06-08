class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr1 = new int[26];
        for(char c : p.toCharArray()){
            arr1[c-'a'] ++;
        }
        List<Integer>ans = new ArrayList();
        for(int i = 0;i < s.length()-p.length()+1;i++){
            int[] arr2 = new int[26];
            for(int j = i;j < i+p.length();j++){
                arr2[s.charAt(j) - 'a'] ++;
            }
            if(Arrays.equals(arr1,arr2)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}