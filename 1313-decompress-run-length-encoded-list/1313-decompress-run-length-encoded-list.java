class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i+=2){
         sum+=nums[i];
       }
       int arr[] = new int[sum];
       int st=0;
       for(int i=1;i<nums.length;i+=2){
        int freq=nums[i-1];
        while(freq>0){
            arr[st]=nums[i];
            freq--;
            st++;
        }
       }
       return arr;
        
        
        
    }
}