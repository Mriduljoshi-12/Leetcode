class Solution {
    public String sortVowels(String s) {
        String v="aeiouAEIOU";
        String str="";
        char ch[]=s.toCharArray();
        for(char c: ch){
            if(v.indexOf(c)!=-1){
                str+=c;
            }
        }
        char chvowel[]=str.toCharArray();
        Arrays.sort(chvowel);
        for(int i=0 ,k=0 ; i<ch.length;i++){
            if(v.indexOf(ch[i])!=-1){
                ch[i]=chvowel[k++];
            }
        }
        return new String(ch);
    }
}