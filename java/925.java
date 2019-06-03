class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0,j = 0,M = name.length(),N = typed.length();
        StringBuilder s = new StringBuilder();
        while(i < M && j < N){
            if(name.charAt(i) == typed.charAt(j)){
                
                s.append(name.charAt(i));

                i ++;
                j ++;
            }else{
                j ++;
            }
        }
        return name.equals(s.toString());
        // int j = 0;
        // for(char c : name.toCharArray()){
        //     if(j == typed.length())return false;
        //     if(typed.charAt(j) != c){
        //         if(j == 0|| typed.charAt(j-1) != typed.charAt(j)){
        //             return false;
        //         }
        //         char cur = typed.charAt(j);
        //         while(j < typed.length() && typed.charAt(j) == cur){
        //             j++;
        //         }
        //         if(j == typed.length() || typed.charAt(j) != c){
        //             return false;
        //         }
        //     }
        //     j++;
        // }
        // return true;
    }
}