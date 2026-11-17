class Solution {
    public int differenceOfSums(int n, int m) {
        int sd=0;
        int nd=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sd+=i;
            }
            else{
                nd+=i;
            }
        }
        return nd-sd ;
    }
}