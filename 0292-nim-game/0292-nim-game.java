class Solution {
    public boolean canWinNim(int n) {
        if(n<=2) return true;
        if(n%4!=0) return true;
        return false;
    }
}