class Solution {
    public List<String> findStrobogrammatic(int n) {
        if(n == 0){
            return new ArrayList();
        }
        if(n == 1){
            ArrayList<String> list = new ArrayList();
            list.add("0");
            list.add("1");
            list.add("8");
            
            return list;
        }
        if(n == 2){
            ArrayList<String> list = new ArrayList();
            list.add("11");
            list.add("88");
            list.add("69");
            list.add("96");
            return list;
        }
        ArrayList<String> ans = new ArrayList();
        for(String s : findStrobogrammatic(n-2)){
            ans.add("1"+s+"1");
            ans.add("6"+s+"9");
            ans.add("9"+s+"6");
            ans.add("8"+s+"8");
        }
        if(n > 3){
        for(String s:invalid(n-2)){
            ans.add("1"+s+"1");
            ans.add("6"+s+"9");
            ans.add("9"+s+"6");
            ans.add("8"+s+"8");
        }
        }
        return ans;
    }
    
    public List<String> invalid(int n){
        ArrayList<String> inv = new ArrayList();
        if(n < 2){
            inv.add("");
            return inv;
        }
        if(n == 2){
            inv.add("00");
            return inv;
        }
        if(n > 3){
            for(String s:invalid(n-2)){
                inv.add("0"+s+"0");
            }
        }
        if(n > 2){
            for(String s:findStrobogrammatic(n-2)){
                inv.add("0"+s+"0");
            }
        }
        return inv;
    }
}