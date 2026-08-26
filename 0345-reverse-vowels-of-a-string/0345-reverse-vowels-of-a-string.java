class Solution {
    public String reverseVowels(String s) {
        char  ch[] =s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start< end && !isvowel(ch[start])){
                start++;
            }
            while(start< end && !isvowel(ch[end])){
                end--;
            }
            if(start<end){
                swap(ch,start,end);
                start++;
                end--;
            }
        }return new String (ch);

    }
    public void swap(char[] w,int start,int end){
        char temp = w[start];
        w[start]=w[end];
        w[end]=temp;
    }
    public boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}