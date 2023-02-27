class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m1 = new HashMap<Character, Character>();
        HashMap<Character, Character> m2 = new HashMap<Character, Character>();
        for (short i = 0; i < s.length(); ++i) {
            if (m1.containsKey(s.charAt(i)) && m1.get(s.charAt(i)) != t.charAt(i))
                return false;

            if (m2.containsKey(t.charAt(i)) && m2.get(t.charAt(i)) != s.charAt(i))
                return false;

            m1.put(s.charAt(i), t.charAt(i));
            m2.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}