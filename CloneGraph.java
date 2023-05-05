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

class CloneGraph {

    HashMap<Integer, Node> oldToNew = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        if(oldToNew.containsKey(node.val)){
            return oldToNew.get(node.val);
        }

        Node copyNode = new Node(node.val, new ArrayList<Node>());
        oldToNew.put(node.val, copyNode);

        for (Node nei : node.neighbors){
            copyNode.neighbors.add(cloneGraph(nei));
        }
        return copyNode;
    }
}
