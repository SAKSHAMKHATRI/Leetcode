class Solution {
    public boolean checkGoodInteger(int n) {
        int x = n;
        int sum=0;
        int SquareSum=0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            SquareSum+=digit*digit;
            n=n/10;
        }
        if(SquareSum-sum>=50) return true;
        else return false; 
    }
}