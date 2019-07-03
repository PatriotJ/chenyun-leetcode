class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer>map = new HashMap();
        for(String domain:cpdomains){
            String[] dom = domain.split("\\s+");
            int count = Integer.parseInt(dom[0]);
            String str = dom[1];
            while(str.indexOf('.') >= 0){
                int k = map.getOrDefault(str,0);
                map.put(str,k+count);
                str = str.substring(str.indexOf('.')+1);
            }
            int k = map.getOrDefault(str,0);
            map.put(str,k+count);
        }
        List<String> ans = new ArrayList();
        for(String str:map.keySet()){
            ans.add(map.get(str)+" "+str);
        }
        return ans;
    }
}