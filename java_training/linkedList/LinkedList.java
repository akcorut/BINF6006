public class LinkedList {
    Node head;
    
    public void insert (int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        //Check if this is first node
        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
        n.next=node;
        }
    }
    
    public void show() {
        Node node = head;
        while (n.next != null) {
            System.out.println(node.data);
        node = node.next;
        }
    System.out.println(node.data);
    }
    public int getFirst() {
        if (head == null) 
            System.out.print(ln("No data"));
        return data;
    }
    public int getLast() {
        if (head == null)
            System.out.println("No data");
        Node tmp = head;
        while(tmp.next != null) {
            //
            //
        }
    }
    public clear() {
        head = null;
    }
}