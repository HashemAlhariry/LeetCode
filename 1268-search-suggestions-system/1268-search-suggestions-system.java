class Solution {
    private Node root = new Node();
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        for (String product : products) {
            insert(product);
        }
        return search(searchWord);
    }
    public void insert(String word) {
        Node node = root;
        for (char ch : word.toCharArray()){
            int index = ch - 'a';
            if (node.child[index] == null) {
                node.child[index] = new Node();
            }
            node = node.child[index];
            node.searchWords.offer(word);
            if (node.searchWords.size() > 3) {
                node.searchWords.pollLast();
            }
        }
    }
    public List<List<String>> search(String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Node node = root;
        for (char ch : searchWord.toCharArray()) {
            int index = ch - 'a';
            if (node != null) {
                node = node.child[index];
            }
            result.add(node == null ? Arrays.asList() : node.searchWords);
        }
        return result;
    }
    public class Node {
        Node [] child = new Node [26];
        LinkedList<String> searchWords = new LinkedList<>();
    }

}