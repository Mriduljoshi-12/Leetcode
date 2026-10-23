class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        genPara("",0,0,n,s);
        return s;
    }
    static void genPara(String p,int o , int c, int n ,List<String> s){
        if(o==n & c==n){
            s.add(p);
            return;
        }
        //opening paranthesis
        if(o<n){
            genPara(p+"(",o+1,c,n,s);
        }
        if(c<o){
            genPara(p+")",o,c+1,n,s);
        }
    }
}