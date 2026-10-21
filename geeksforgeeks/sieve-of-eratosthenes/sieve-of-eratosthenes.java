class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;
        
        // Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p starting from p * p
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Collect all prime numbers into the result list
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }
        
        return result;
    }
}