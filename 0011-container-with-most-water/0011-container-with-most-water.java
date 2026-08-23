class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int higt=0,width=0;
        int i=0,j=height.length-1;
        int maxcapacity=0;
        while(i<j){
            width=j-i;
            higt=Math.min(height[i],height[j]);
            area=width*higt;
            maxcapacity=Math.max(maxcapacity,area);
            if(height[j]<height[i])j--;
            else i++;
        }
        return maxcapacity;
    }
}