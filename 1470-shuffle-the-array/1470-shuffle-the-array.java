class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len= nums.length;
        int arr[]=new int [len];
        int k=0,i=0,j=n;
        while(i<n && j<len && k<len){
                arr[k++]=nums[i];
                i++;
                arr[k++]=nums[j];
                j++;
        } return arr;
    }
}