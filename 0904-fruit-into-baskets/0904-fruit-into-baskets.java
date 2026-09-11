class Solution {
    public int totalFruit(int[] fruits) {
        int max=0,n=fruits.length;
         int freq[]= new int[n];
         int type =0,s=0,i=0;
         for(;i<n;i++){
            //expand ya include ..
            int ft=fruits[i];
            if(freq[ft]==0)type++;
            freq[ft]++;
            //shrink
            while(type>2){
                int st=fruits[s];
                freq[st]--;
                if(freq[st]==0)type--;
                s++;
            }
            int size= i-s+1;
            max=Math.max(max,size);
         }return max;
    }
}