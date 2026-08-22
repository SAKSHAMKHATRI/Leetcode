class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product =1;
        int x = n;
        while(x>0){
            int digit = x%10;
            sum+=digit;
            product*=digit;
            x=x/10;
        }
        int u = sum + product;
        if(n%u==0) return true;
        return false;
    }
}