class Solution {
 public static String minWindow(String s, String t) {
        if (t == "") {
            return "";
        }
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> rCount = new HashMap<>();
        for (int c = 0; c < t.length(); c++) {
            char c1 = t.charAt(c);
            rCount.put(c1, rCount.getOrDefault(c1, 0) + 1);
        }

        int l = 0;
        int r = 0;
        int current = 0;
        int required = rCount.size();

        int resLen = Integer.MAX_VALUE;

        int start = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            
            if (rCount.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);

                if (window.get(c).equals(rCount.get(c))) {
                    current++;
                }
            }

            
            while (current == required) {
             
                if (r - l<resLen) {
                    start = l;
                    resLen = r - l;
                }

                char d = s.charAt(l);
                l++;

                if (rCount.containsKey(d)) {
                    if (window.get(d).equals(rCount.get(d))) {
                        current--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(start, start + resLen);
    }
}