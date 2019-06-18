class Solution {
    public boolean validWordSquare(List<String> words) {
        int m = words.size();
        if(m != words.get(0).length()){
            return false;
        }
        
        for(int i = 0;i < m;i++){
            StringBuilder s = new StringBuilder();
            for(int j =0;j < m;j++){
                if(words.get(j).length() > i){
                    s.append(words.get(j).charAt(i)); 
                }
            }
            if(!s.toString().equals(words.get(i))){
                return false;
            }
        }
        return true;
    }
}