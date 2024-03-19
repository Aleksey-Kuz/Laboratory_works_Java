public class Node {
    private int _value;
    private Node _next_node;
    Node(int value)
    {
        _value = value;
        _next_node = null;
    }
    Node(int value, Node next_node) {
        _value = value;
        _next_node = next_node;
    }
    public void set_value(int new_value) {
        _value = new_value;
    }
    public void set_next_node(Node new_next_node) {
        _next_node = new_next_node;
    }
    public int get_value() {
        return _value;
    }
    public Node get_next_node() {
        return _next_node;
    }
}
