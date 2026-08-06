class Solution {
    public String convertToBase7(int num) {
        
        if(num==0) return "0";
        boolean negative = num<0;
        num =Math.abs(num);
        StringBuilder st = new StringBuilder();
        while(num>0){
            int digit = num%7;
            st.append(digit);
            num = num/7;
        }    
        if(negative) st.append("-");
        return st.reverse().toString();
    }
}