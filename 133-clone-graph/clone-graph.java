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