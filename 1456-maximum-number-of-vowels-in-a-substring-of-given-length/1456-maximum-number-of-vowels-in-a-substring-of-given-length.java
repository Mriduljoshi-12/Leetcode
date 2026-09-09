class Solution {
    public int maxVowels(String s, int k) {
        int maxcount=0,count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<k;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') count++;
        }
        maxcount=Math.max(maxcount,count);
        for(int i=k;i<ch.length;i++){
            if(ch[i-k]=='a'||ch[i-k]=='e'||ch[i-k]=='o'||ch[i-k]=='i'||ch[i-k]=='u') count--;   
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') count++;  
            maxcount=Math.max(maxcount,count);       
        }
       
        return maxcount;
    }
}