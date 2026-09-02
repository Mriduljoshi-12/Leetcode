class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasodd= false ;
        boolean haseve=false;
        for( int n : nums1 ){
            if(n%2==0){
                haseve=true;
            }
            else{
                hasodd=true;
            }
        }
        if(hasodd||haseve){
            return true;
        }
        else{
            return false;
        }
    }
}