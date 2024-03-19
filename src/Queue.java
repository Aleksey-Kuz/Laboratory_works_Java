public class Queue {
    private Node _front;
    private Node _back;
    private int _size;

    // Create an empty queue
    Queue()
    {
        _front = null;
        _back = null;
        _size = 0;
    }

    // Create a queue with a starting element
    Queue(int start_elem)
    {
        _front = new Node(start_elem);
        _back = _front;
        _size = 1;
    }

    // Create a queue from an integer array
    Queue(int [] arr_elem)
    {
        for (int elem: arr_elem) {
            push(elem);
        }
    }

    public boolean is_empty()
    {
        return _size == 0;
    }

    public int get_size()
    {
        return _size;
    }

    public void push(int elem)
    {
        if (_size == 0) {
            _front = new Node(elem);
            _back = _front;
            _size = 1;
        }
        else {
            _back.set_next_node(new Node(elem));
            _back = _back.get_next_node();
            _size++;
        }
    }

    public int pop()
    {
        int result = _front.get_value();
        if (_front == _back)
            _front = _back = null;
        else
            _front = _front.get_next_node();
        _size--;
        return result;
    }

    public int front()
    {
        return _front.get_value();
    }

    public int back()
    {
        return _back.get_value();
    }

    // Searching for an element in the queue
    public boolean find_elem(int elem)
    {
        Node tmp = _front;
        while (tmp != null) {
            if (tmp.get_value() == elem)
                    return true;
            tmp = tmp.get_next_node();
        }
        return false;
    }
}
