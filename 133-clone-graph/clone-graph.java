/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        Node copied = new Node(node.val);
        map.put(node, copied);

        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor)) {
                copied.neighbors.add(cloneGraph(neighbor));
            } else {
                copied.neighbors.add(map.get(neighbor));
            }
        }

        return copied;
    }
}