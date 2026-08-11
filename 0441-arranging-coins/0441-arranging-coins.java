class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        while(n>0){
            count++;
            n-=count;
        }
        return count-1;
    }
}