class Solution {

    public static String reverseWords(String s) {

        char[] s1 = s.toCharArray();

        String s2 = trimSpaces(s1, s1.length);
        StringBuilder builder = new StringBuilder(s2);

        strRev(builder, 0, builder.length() - 1);

        int n = builder.length();
        int start = 0, end = 0;

        while (start < n) {

            while (end < n && builder.charAt(end) != ' ')
                ++end;

            strRev(builder, start, end - 1);
            start = end + 1;
            ++end;
        }

        return builder.toString();
    }

    public static void strRev(StringBuilder sb, int startRev, int endRev) {
        while (startRev < endRev) {
            char temp = sb.charAt(startRev);
            sb.setCharAt(startRev++, sb.charAt(endRev));
            sb.setCharAt(endRev--, temp);
        }
    }

    static String trimSpaces(char[] a, int n) {
        int x = 0, y = 0;

        while (y < n) {
            while (y < n && a[y] == ' ') y++;
            while (y < n && a[y] != ' ') a[x++] = a[y++];
            while (y < n && a[y] == ' ') y++;
            if (y < n) a[x++] = ' ';
        }

        return new String(a).substring(0, x);
    }
}