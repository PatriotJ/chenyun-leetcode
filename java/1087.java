class Solution {
    List<String> ans = new ArrayList();
    public String[] expand(String S) {
        String[] s = S.split("\\{|\\}");
        dfs(s,0,"");
        String[] res = ans.toArray(new String[ans.size()]);
        return res;
        // Arrays.sort
    }
    
    public void dfs(String[] s,int i,String path){
        if(i == s.length){
            ans.add(path);
            return;
        }
        if(s[i] == ""){
            dfs(s,i+1,path);
        }else{
            String[] str = s[i].split(",");
            Arrays.sort(str);
        for(String word:str){
            dfs(s,i+1,path+word);
        }
        }        
    }
}