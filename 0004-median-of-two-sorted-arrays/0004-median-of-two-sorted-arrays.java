class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m= nums1.length;
         int n= nums2.length;
         int arr[]= new int[m+n];
         int l= m+n;
         int i=0,j=0,k=0;
         while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
         }

         while (i<m){
            arr[k]=nums1[i];
            k++;
            i++;
         }
         while (j<n){
            arr[k]=nums2[j];
            k++;
            j++;
         }
        if(l%2==0){
            return ( arr[l/2 -1] + arr[l/2] ) /2.0;
        }
        else {
            return arr[l/2];
        }
    }
}