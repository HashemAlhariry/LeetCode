class Solution {
    public class Node{
        Node[] children = new Node[26];
        String current="";

    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String result="";
        Node rootNode = new Node();
        for (int i = 0; i <dictionary.size() ; i++) {
            insertDictionary(dictionary.get(i),rootNode);
        }
        String [] words = sentence.split(" ");

        for (int i = 0; i <words.length ; i++) {
            String temp=getWords(words[i],rootNode);
            result += temp=="" ?words[i]:temp;
            if(i!=words.length-1)
                result+=" ";
        }

        return result;
    }

    private String getWords(String word, Node rootNode) {
        String currentString="";
        for (int i = 0; i <word.length() ; i++) {
            if(rootNode.children[word.charAt(i)-'a']!=null){
                rootNode=rootNode.children[word.charAt(i)-'a'];
                if(rootNode.current!="") {
                    currentString = rootNode.current;
                    break;
                }
            }else {
                break;
            }
        }
        return currentString;
    }

    private void insertDictionary(String s,Node root) {

        for (int i = 0; i <s.length() ; i++) {
            if(root.children[s.charAt(i)-'a']==null)
                root.children[s.charAt(i)-'a']=new Node();
            root=root.children[s.charAt(i)-'a'];
            if(i==s.length()-1){
                root.current=s;
            }
        }
    }
}