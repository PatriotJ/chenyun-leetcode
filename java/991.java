class Solution {
    public int brokenCalc(int X, int Y) {
        if(Y <= X){
            return X - Y;
        }else{
            if(Y % 2 == 1){
                return 1 + brokenCalc(X,Y+1);
            }else{
                if(X >= Y / 2){
                    return X - Y/2 + 1;
                }else{
                    return 1 + brokenCalc(X,Y/2);
                }
            }
        }
    }
}