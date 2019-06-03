class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> list1 = helper(S);
        LinkedList<Character> list2 = helper(T);
        return list1.equals(list2);
    }
    
    public LinkedList<Character> helper(String s){
        LinkedList<Character> list = new LinkedList();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                list.add(s.charAt(i));
            }else{
                if(list.isEmpty()){
                    continue;
                }else{
                    list.pollLast();
                }
            }
        }
        return list;
    }
}