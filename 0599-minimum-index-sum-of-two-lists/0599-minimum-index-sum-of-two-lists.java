class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String>s = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i =0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int sum = i+j;
                    if(sum<min){
                        min = sum;
                        s.clear();
                        s.add(list1[i]);
                    }
                    else if(sum==min){
                        s.add(list1[i]);
                    }
                }
            }
        }
        return s.toArray(new String[0]);
    }
}