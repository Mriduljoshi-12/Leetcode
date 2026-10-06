class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        int x=1;
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                x++;
            }
            else if (nums[i]>x){
                arr.add(x);
                x++;
                i--;
            }
        }
        while (x<=n){
            arr.add(x);
            x++;
        }
        return arr;
    }
}