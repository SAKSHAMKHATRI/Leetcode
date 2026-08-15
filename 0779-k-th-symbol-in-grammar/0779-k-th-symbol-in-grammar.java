class Solution {
    public int kthGrammar(int n, int k) {
       if(n==1 && k==1) return 0;
       int length = (int)Math.pow(2,n-1);
       int mid = length/2;
       if(k<=mid) return kthGrammar(n-1,k);
       else return 1-kthGrammar(n-1,k-mid);
    }
    //  // Base case: Row 1 mein sirf ek element 0 hota hai
    //     if(n == 1 && k == 1) return 0;

    //     // Row n ki length 2^(n-1) hoti hai
    //     // n=1 => 2^0 = 1
    //     int length = (int)Math.pow(2, n - 1);

    //     // Row ko 2 equal halves mein divide karne ke liye mid
    //     // Previous row ki length bhi mid ke equal hoti hai
    //     int mid = length / 2;

    //     // Agar k first half mein hai,
    //     // toh iska answer previous row ke same k position par hoga
    //     if(k <= mid)
    //         return kthGrammar(n - 1, k);

    //     // Agar k second half mein hai,
    //     // toh previous row mein corresponding position k-mid hogi
    //     // Second half previous row ka flipped version hota hai toh 1- krdia 
    //     else
    //         return 1 - kthGrammar(n - 1, k - mid);
}