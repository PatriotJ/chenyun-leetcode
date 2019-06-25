class Solution {
    
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList();
        List<StringBuilder> list = new ArrayList();
        list.add(new StringBuilder());
        for(char c:S.toCharArray()){
            int n = list.size();
            if(Character.isLetter(c)){
                for(int i = 0;i < n;i ++){
                    list.add(new StringBuilder(list.get(i)));
                    list.get(i).append(Character.toLowerCase(c));
                    list.get(n+i).append(Character.toUpperCase(c));
                }
            }else{
                for(int i = 0;i < n;i++){
                    list.get(i).append(c);
                }
            }
        }
        for(StringBuilder sb:list){
            ans.add(sb.toString());
        }
        return ans;
    }  
}