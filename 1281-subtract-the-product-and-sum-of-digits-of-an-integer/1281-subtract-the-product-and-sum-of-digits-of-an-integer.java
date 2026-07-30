class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum=0;
        int x = n;
        while(x>0){
            int digit = x%10;
            product*=digit;
            sum+=digit;
            x=x/10;
        }
        return (product-sum);
    }
}