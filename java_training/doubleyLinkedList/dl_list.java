public class dl_list {
    class Node {
        int data;
        Node prev;
        Node next;

    Node(int d) {
        data = d;
    }
    }
    void append(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
    }
}