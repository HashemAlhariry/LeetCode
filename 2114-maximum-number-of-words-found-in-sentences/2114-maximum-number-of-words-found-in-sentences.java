class Solution {
    public int mostWordsFound(String[] sentences) {
                 int maximumNumber=0;
        for(int i =0;i<sentences.length;i++){
            String s = sentences[i];
            s=s.trim();
            String[] words = s.split("\\s+");
            if(maximumNumber<words.length){
                maximumNumber=words.length;
            }
        }
        return maximumNumber;
    }
}