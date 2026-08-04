class Solution {
    public int countSegments(String s) {
        String[] arr = s.split(" ");
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
            count++;                
        }
        }
        return count;
    }
}