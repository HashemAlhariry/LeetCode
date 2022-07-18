//Problem Description
/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)



Example 1:



Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]
Example 2:



Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]


Constraints:

The number of nodes in the tree is in the range [0, 104].
0 <= Node.val <= 104
The height of the n-ary tree is less than or equal to 1000.


Follow up: Recursive solution is trivial, could you do it iteratively?
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4= new Node(4);
        Node n5 = new Node(5);
        Node n6= new Node(6);

        List<Node> n1Nodes= new ArrayList<>();
        n1Nodes.addAll(Arrays.asList(n3,n2,n4));
        n1.setChildren(n1Nodes);

        List<Node> n3Nodes=new ArrayList<>();
        n3Nodes.addAll(Arrays.asList(n5,n6));
        n3.setChildren(n3Nodes);

        List<Integer> list=  preorderIterative(n1);
        list.stream().forEach(e-> System.out.print(e+" "));

    }
    public static List<Integer> list = new ArrayList<>();

    //Recursive Solution
    public static List<Integer> preorderRecursive(Node root) {

        if(root!=null)
            list.add(root.val);

        if(root!=null && root.children!=null)
            for (int i = 0; i <root.children.size() ; i++) {
                preorderRecursive(root.children.get(i));
             }

        return list;
    }

    //Iterative Solution
    public static List<Integer> preorderIterative(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack= new Stack<>();
        stack.add(root);

        while(!stack.empty()){
            Node temp = stack.pop();
            if(temp.children!=null)
            for (int i = temp.children.size()-1; i >=0 ; i--) {
                stack.add(temp.children.get(i));
            }
            list.add(temp.val);
        }

        return list;
    }

}


class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    public void setChildren(List<Node> children) {
        this.children = children;
    }
}