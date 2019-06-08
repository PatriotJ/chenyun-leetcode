class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,Character>map = new HashMap();
        // map.put(1,'I');
        // map.put(5,'V');
        // map.put(10,'X');
        // map.put(50,'L');
        // map.put(100,'C');
        // map.put(500,'D');
        // map.put(1000,'M');
        StringBuilder s = new StringBuilder();
        while(num > 0){
            if(num >= 1000){
                s.append('M');
                num -= 1000;
                continue;
            }
            if(num < 1000 && num >= 900){
                s.append('C');
                s.append('M');
                num -= 900;
                continue;
            }
            if(num >= 500){
                s.append('D');
                num-=500;
                continue;
            }
            if(num < 500 && num >= 400){
                s.append('C');
                s.append('D');
                num -= 400;
                continue;
            }
            if(num >= 100){
                s.append('C');
                num -= 100;
                continue;
            }
            if(num <100 && num >= 90){
                s.append('X');
                s.append('C');
                num -= 90;
                continue;
            }
            if(num >= 50){
                s.append('L');
                num -= 50;
                continue;
            }
            if(num < 50 && num >= 40){
                s.append('X');
                s.append('L');
                num -= 40;
                continue;
            }
            if(num >= 10){
                s.append('X');
                num -= 10;
                continue;
            }
            if(num <10 && num >= 9){
                s.append('I');
                s.append('X');
                num -= 9;
                continue;
            }
            if(num >= 5){
                s.append('V');
                num -= 5;
                continue;
            }
            if(num < 5 && num >= 4){
                s.append('I');
                s.append('V');
                num -= 4;
                continue;
            }
            s.append('I');
            num --;
        }
        return s.toString();
    }
}