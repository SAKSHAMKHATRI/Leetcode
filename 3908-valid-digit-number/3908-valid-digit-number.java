class Solution {
    public boolean validDigit(int n, int x) {
        int first = n;
        while(first>=10){
            first = first/10;
        }
        if(first==x) return false;
        int temp =n;
        while(temp>0){
            int digit = temp%10;
            if(digit==x) return true;
            temp = temp/10;
        }
        return false;
    }
}