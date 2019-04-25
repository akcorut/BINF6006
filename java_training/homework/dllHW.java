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
    public void push(int newData) {
        Node newNode = new Node(newData); 

        newNode.next = head; 
        newNode.prev = null;

        if (head != null) 
            head.prev = newNode;

        head = newNode; 
    }
    void append(int newData) {
        
        Node newNode = new Node(newData); 
        Node last = head;
        
        newNode.next = null;
        
        if (head == null) { 
            newNode.prev = null; 
            head = newNode; 
            return; 
        }
        while (last.next != null) 
            last = last.next; 

        last.next = newNode; 

        newNode.prev = last; 
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
    public void insert(Node targetNode, int newData) { 
        if (targetNode == null) { 
            System.out.println("Node is null"); 
            return; 
        }
        Node newNode = new Node(newData); 

        newNode.next = targetNode.next; 
        targetNode.next = newNode; 
        newNode.prev = targetNode; 

        if (newNode.next != null) 
            newNode.next.prev = newNode; 
    }
    void isEmpty() {
        if (head == null) {
            System.out.println("\nList is empty\n"); 
            return; 
        } else {
            System.out.println("\nList is not empty\n"); 
            return;
        }    
    }
    public int size(Node node) { 
        int r = 0; 
        while (node != null) { 
            r++; 
            node = node.next; 
        }
        return r; 
    }
    public void show(Node node) 
    { 
        Node last = null;

        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        }
        System.out.println(); 
    } 
}

