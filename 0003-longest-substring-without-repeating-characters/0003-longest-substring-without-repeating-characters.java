class Solution {
   public static int lengthOfLongestSubstring(String s) {

        HashMap<Character ,Integer> map=new LinkedHashMap<>();
        int maxLength=0;
        for (int i = 0; i < s.length(); i++) {
            int temp = i;
            while (temp<s.length()){
                if(map.containsKey(s.charAt(temp)))
                    break;

                map.put(s.charAt(temp),1);
                temp++;
            }
            maxLength=Math.max(maxLength,map.size());
            map=new HashMap<>();
        }

        return maxLength;


    }

}