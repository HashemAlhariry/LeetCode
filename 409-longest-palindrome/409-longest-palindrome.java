class Solution {
    public int longestPalindrome(String s) {
          Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        int totalLength=0;
        boolean foundOddNumber=false;

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            if(entry.getValue()%2==0){
                totalLength+=entry.getValue();
            }else {
                totalLength+=entry.getValue()-1;
                foundOddNumber=true;
            }
        }
        if(foundOddNumber)
          totalLength+=1;

        return totalLength;
    }
}