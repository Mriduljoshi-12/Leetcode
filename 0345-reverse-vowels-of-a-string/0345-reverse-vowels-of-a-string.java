class Solution {
    public String reverseVowels(String s) {
        char  ch[] =s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!isvowel(ch[start])){
                start++;
            }
            if(!isvowel(ch[end])){
                end--;
            }
            if(isvowel(ch[start]) && isvowel(ch[end])){
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
            }
        }return new String (ch);
    }
    public boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
               ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}