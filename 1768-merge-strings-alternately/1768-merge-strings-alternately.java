class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int i=0;
        String s="";
        while(i<Math.max(w1,w2)){
            if(i<w1){
                s+=word1.charAt(i);

            }
            if(i<w2){
                s+=word2.charAt(i);
            }
            i++;
        }
        return s;
    }
}