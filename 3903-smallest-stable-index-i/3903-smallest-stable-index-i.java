class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        int arr[]= new int [n];
        int minv=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            minv=Math.min(minv,nums[i]);
            arr[i]=minv;
        }
        int maxv=0;
        for(int i=0;i<n;i++){
            maxv=Math.max(maxv,nums[i]);
            int a=maxv-arr[i];
            if(a<=k) return i;
        }
        return -1;
    }
}