class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char c1=s.charAt(0);
        char r1=s.charAt(1);

        char c2=s.charAt(3);
        char r2=s.charAt(4);

        for (int i = c1; i <=c2 ; i++) {

            for (int j = r1-48; j <= r2-48; j++) {
                char ch = (char)i;
                int num= j;
                res.add(ch+""+num);
            }

        }

        return res;
    }
}