class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;

        boolean[] notPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                // start at i*i (use long to avoid overflow)
                for (long j = (long) i * i; j < n; j += i) {
                    notPrime[(int) j] = true;
                }
            }
        }
        return count;
    }
}

// class Solution {
//     public boolean isPrime(int x){
//         // if(x==2 || x==3){
//         //     return true;
//         // }
//         for(int i=2;i<=Math.sqrt(x);i++){
//             if(x%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public int countPrimes(int n) {
//         int count =0;
//         if(n<=1){
//             return 0;
//         }
//         int i=2;
//         while(i<n){
//             if(isPrime(i)==true){
//                 count++;
//             }
//             i++;
//         }
//         return count;
//     }
// }