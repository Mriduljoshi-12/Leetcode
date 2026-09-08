class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        if (2 * k + 1 > n) {
            Arrays.fill(arr, -1);
            return arr;
        }
        for(int i=k;i<n-k;i++){
            long sum=0;
            long avg=0;
                for(int j=i-k;j<=i+k;j++){
                    sum+=nums[j];
                }
        avg=(sum/((2*k)+1));
        arr[i]=(int)avg;
        }   
        return arr;
    }
}