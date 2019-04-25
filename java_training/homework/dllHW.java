public class DLL { 
    Node head;

    class Node { 
        int data; 
        Node prev; 
        Node next; 

        Node(int d) { 
            data = d; 
        } 
    }
    public void push(int new_data) {
        Node new_Node = new Node(new_data); 

        new_Node.next = head; 
        new_Node.prev = null;

        if (head != null) 
            head.prev = new_Node;

        head = new_Node; 
    }
    void append(int new_data) {
        
        Node new_node = new Node(new_data); 
        Node last = head;
        
        new_node.next = null;
        
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        }
        while (last.next != null) 
            last = last.next; 

        last.next = new_node; 

        new_node.prev = last; 
    }
    void delete(Node headPoint, Node delData) {

        if (head == null || delData == null) { 
            return; 
        } 

        if (head == delData) { 
            head = delData.next; 
        } 

        if (delData.next != null) { 
            delData.next.prev = delData.prev; 
        } 

        if (delData.prev != null) { 
            delData.prev.next = delData.next; 
        }
        return; 
    }
    
}

