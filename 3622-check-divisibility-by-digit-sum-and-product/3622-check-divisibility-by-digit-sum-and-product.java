class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int orig=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        return orig % (sum+prod)==0;
    
    }
}