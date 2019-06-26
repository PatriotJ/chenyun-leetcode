class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(z == 0){
            return true;
        }
        if(z > x + y){
            return false;
        }
        int gcd = gcd(x,y);
        return z % gcd == 0;
        
    }
    public int gcd(int x,int y){
        if(y == 0){
            return x;
        }
        return gcd(y,x % y);
    }
}