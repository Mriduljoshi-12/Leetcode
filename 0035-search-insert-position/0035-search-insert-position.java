class Solution {
    public int searchInsert(int[] nums, int target) {
       // int a=Arrays.binarySearch(nums,target);
        //return a<0? Math.abs(a)-1:a;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>=target){
        return i ;
        }   
        }
        return nums.length;
    }
}