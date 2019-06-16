class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> phone = new HashMap<Character, String>() {{
    put('2', "abc");
    put('3', "def");
    put('4', "ghi");
    put('5', "jkl");
    put('6', "mno");
    put('7', "pqrs");
    put('8', "tuv");
    put('9', "wxyz");
  }};
        // List<String> output = new ArrayList();
        LinkedList<String> last = new LinkedList();
        int l = digits.length();
        if(l == 0){
            return last;
        }
        for(int i = 0;i < l;i++){
            String x = phone.get(digits.charAt(i));
            if(i == 0){
                for(char c:x.toCharArray()){
                    last.add(c+"");
                }
            }
            else{
                int y = last.size();
                for(int v = 0;v <y;v++){
                    // System.out.println(y.length());
                    String s = last.poll();
                    for(char c:x.toCharArray()){
                        // System.out.println(s+c);
                        last.add(s+c);
                    }
                }
            }
        }
        return last;
    }
}