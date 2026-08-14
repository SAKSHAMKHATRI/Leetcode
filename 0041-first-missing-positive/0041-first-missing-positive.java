class Solution {
    public void swap(int[] arr, int i , int index){
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

    // using cyclic sort
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i<n){            
            if(arr[i]<=0 || arr[i]>n || arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
            else swap(arr,i,arr[i]-1);
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) return j+1;
        }
        return n+1;
        // arr[i]<=0  //agr negative or 0 hai  (Ignore)
        // arr[i]>n  // element bda hai length se (Ignore)
        // arr[i]==i+1. // agr shi position pe hai ignore 
        // arr[i]==arr[arr[i]-1] duplicate hai chordo

    }
}