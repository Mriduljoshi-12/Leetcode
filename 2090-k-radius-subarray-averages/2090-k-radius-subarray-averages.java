class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        long sum=0;
        for(int i=0;i<((2*k)+1)&& i<n;i++){
            sum+=nums[i];
        }
        for(int i=k;i<n-k;i++){
            long avg=0;
            if(i==k){
                avg=(int)(sum/((2*k)+1));
            }
            else{
                sum= sum -nums[i-k-1] +nums[i+k];
                avg=(int)(sum/((2*k)+1));
            }
            arr[i]=(int)avg;
        }
        return arr;
    }
}