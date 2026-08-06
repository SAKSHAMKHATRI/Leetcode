class Solution {
    public int smallestNumber(int n, int t) {
        if(n==0) return 1;
        while(true){
            int x=n;
            int pro=1;
            while(x>0){
            int digit = x%10;
            pro = pro *digit;
            x=x/10;
        }
        if(pro%t==0) return n;
        n++;
    }
    }
}