class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int value : nums) {
            elementSum += value;
            while (value != 0) {
                int digit = value % 10;
                digitSum += digit;
                value /= 10;
            }
        }
        return elementSum - digitSum;
    }
}