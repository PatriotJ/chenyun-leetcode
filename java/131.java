class Solution {
    Map<String,List<List<String>>> map = new HashMap<String,List<List<String>>>();
    public List<List<String>> partition(String s) {
        int l = s.length();
        if(l == 0){
            return new ArrayList<>();
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        
        for(int i = 0;i < l;i++){
            int start = 0,end = i;
            boolean pal = true;
            while(start < end){
                if(s.charAt(start) == s.charAt(end)){
                    start ++;
                    end --;
                }else{
                    pal = false;
                    break;
                }
            }
            if(pal){
                String first = s.substring(0,i+1);
                String second = s.substring(i+1); 
                List<String> path = new ArrayList();
                path.add(first);
                List<List<String>> tmp = map.getOrDefault(second,partition(second));
                if(tmp.size() == 0){
                    ans.add(path);
                }else{
                    for(List<String> sub:tmp){
                        List<String> p =new ArrayList(path);
                        p.addAll(sub);
                        ans.add(p);
                    }
                }
            }
        }
        map.put(s,ans);
        return ans;
    }
}