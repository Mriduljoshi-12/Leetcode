class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int len = cardPoints.length;
        if (len==k){
            for(int n : cardPoints){
                lsum+=n;
            }
            return lsum;
        }
        int rin=len-1,rsum=0;
        for(int l=0;l<k;l++){
            lsum+=cardPoints[l];
        }
        int maxsum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i] ;
            rsum+=cardPoints[rin--];
            maxsum=Math.max(maxsum,lsum+rsum);
       }
        return maxsum;
    }
}