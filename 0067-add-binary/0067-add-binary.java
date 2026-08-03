class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if(i>=0){
                int digitA = a.charAt(i)-'0';
                sum+=digitA;
                i--;
            }
            if(j>=0){
                int digitB = b.charAt(j)-'0';
                sum+=digitB;
                j--;
            }
            int bit = sum %2;
            carry = sum/2;
            ans.append(bit);
        }
        return ans.reverse().toString();
    }
}