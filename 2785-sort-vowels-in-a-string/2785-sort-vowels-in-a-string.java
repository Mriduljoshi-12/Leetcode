class Solution {
    public String sortVowels(String s) {

        String str = "aeiouAEIOU";
        StringBuilder v = new StringBuilder();
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (str.indexOf(c) != -1) {
                v.append(c);
            }
        }
        char vowel[] = v.toString().toCharArray();
        Arrays.sort(vowel);
        for (int i = 0, k = 0; i < ch.length; i++) {
            if (str.indexOf(ch[i]) != -1) {
                ch[i] = vowel[k++];
            }
        }
        return new String(ch);
    }
}
