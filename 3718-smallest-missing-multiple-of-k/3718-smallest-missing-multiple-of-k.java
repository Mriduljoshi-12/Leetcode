class Solution {
    public int missingMultiple(int[] nums, int k) {
        int len=nums.length;
        Arrays.sort(nums);
        int ex=k;
        for(int i=0;i<len;i++){
            if(nums[i]==ex){
                ex+=k;
            }
            else if(nums[i]>ex) {return ex;}
            }
        return ex;
    }
}