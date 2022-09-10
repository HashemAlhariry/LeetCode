class Solution {
         public static String decodeMessage(String key, String message) {
        String messageDecoded="";
        key=key.replaceAll(" ","");

        HashMap<Character,Character> map = new HashMap<>();
        int index=0;
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i <key.length(); i++) {
            if(!linkedHashMap.containsKey(key.charAt(i))){
                linkedHashMap.put(key.charAt(i),1);
            }
        }
        key="";
        for (Character character : linkedHashMap.keySet()) {
            key+=character;
        }

        for (int i = 0; i <key.length() ; i++) {
                int number=97+i;
                char c=(char)number;
                map.put(key.charAt(i),c);
        }
        for (int i = 0; i <message.length() ; i++) {
            if(map.get(message.charAt(i))==null){
                messageDecoded+=" ";
            }else{
                messageDecoded+=map.get(message.charAt(i));
            }

        }
        return messageDecoded;
    }
}