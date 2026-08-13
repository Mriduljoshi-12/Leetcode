class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int x= nums[0]*nums[1]*nums[n-1];
        int y= nums[n-1]*nums[n-2]*nums[n-3];
        if(x>y) return x;
        else return y;
    }
}