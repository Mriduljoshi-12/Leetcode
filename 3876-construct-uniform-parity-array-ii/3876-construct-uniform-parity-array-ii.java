class Solution {
    public boolean uniformArray(int[] nums1) {
        int  minodd=Integer.MAX_VALUE;
          for(int n:nums1){
            if(n%2!=0){
            if(minodd>=n){
                minodd=n;
            }}
          }
          int mineve=Integer.MAX_VALUE;
          for(int n:nums1){
            if(n%2==0){
            if(mineve>=n){
                mineve=n;
            }}
          }
          if(minodd==Integer.MAX_VALUE) return true;
         return mineve>=minodd;

    }
}