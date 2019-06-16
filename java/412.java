class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 1;i <= n;i++){
            list.add(helper(i));
        }
        return list;
    }
    public String helper(int n){
        if(n % 15 == 0){
            return "FizzBuzz";
        }else if(n % 5 == 0){
            return "Buzz";
        }else if(n % 3 ==0){
            return "Fizz";
        }else{
            return n + "";
        }
    }
}