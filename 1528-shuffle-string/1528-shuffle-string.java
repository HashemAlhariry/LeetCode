class Solution {
    public String restoreString(String s, int[] indices) {
       Character [] characters= new Character[indices.length];
        for (int i = 0; i <indices.length ; i++) {
            characters[indices[i]]=s.charAt(i);
        }
        String string="";
        for (int i = 0; i <characters.length ; i++) {
            string+=characters[i];
        }
        return string;
    }
}