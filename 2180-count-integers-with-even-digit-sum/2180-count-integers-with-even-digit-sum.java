class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            int sum =0;
            int temp=i;
            while(temp>0){
               int n= (temp%10);
               sum+=n;
               temp/=10;

            }
            if(sum%2==0) c++;
        }return c;
    }
}