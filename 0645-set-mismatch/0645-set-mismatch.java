class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int arr[]= new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                arr[0]=nums[i];
                break;
            }
        }
        int num=1;
        for(int x:nums){
            if(num==x) num++;
            else if(x>num) { 
                arr[1]=num;
             break;
            }
        }
        if(arr[1]==0){
            arr[1]=nums.length;
        }
        
        return arr;
    }
}