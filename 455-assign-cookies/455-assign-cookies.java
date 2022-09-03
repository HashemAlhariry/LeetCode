class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int satisChildren=0;
        int indexOfChildren=0;

        for (int i = 0; i <s.length ; i++) {
            if(indexOfChildren<g.length && s[i]>=g[indexOfChildren]){
                satisChildren++;
                indexOfChildren++;
            }

        };
    return satisChildren;
    }
}