class Solution {
    public String nextClosestTime(String time) {
        Set<Integer>set = new HashSet();
        int start = 60 * Integer.parseInt(time.substring(0, 2));
        start += Integer.parseInt(time.substring(3));
        for(char c:time.toCharArray()){
            if(c != ':'){
                set.add(c - '0');
            }
        }
        int today = 1440;
        int next = 1440;
        for(int h1:set){
            for(int h2:set){
                if(h1 * 10 + h2 < 24){
                    for(int m1:set){
                        for(int m2:set){
                            if(m1 * 10 + m2 < 60){
                                int cur = 60 * (h1*10+h2) + m1*10+m2;
                                if(cur > start){
                                    today = Math.min(today,cur);
                                }
                                if(cur < start){
                                    next = Math.min(next,cur);
                                }
                            }
                        }
                    }
                }
            }
        }
        if(today != 1440){
            return String.format("%02d:%02d", today / 60, today % 60);
        }else if(next != 1440){
            return String.format("%02d:%02d", next / 60, next % 60);
        }
        return time;

    }
}