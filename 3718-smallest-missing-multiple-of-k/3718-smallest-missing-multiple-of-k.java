class Solution {
    public int missingMultiple(int[] nums, int k) {
        int len=nums.length;
        for(int mul=k;mul<=k*(len+1);mul+=k){
            boolean found=false;
            for(int num:nums){
                if(num==mul){
                    found=true;
                    break;
                }
            }
            if(!found)return mul;   
        }
    
        return -1;
    }
}