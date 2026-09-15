class Solution {
    public long sumAndMultiply(int n) {
        int x = n;
        int y = 0;
        int sum=0;
        int place = 1;
        while(x>0){
            int digit = x%10;
            if(digit>0) {
            y=y+digit*place;
            sum+=digit;
            place *= 10;
            }
            x= x/10;
        }
        return (long)y*sum;
    }
}