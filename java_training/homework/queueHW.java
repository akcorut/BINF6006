/**
 * @author Adnan Kivanc Corut
 */

class Queue {
    int front, rear, size, capacity;
    int queue[];
    
    Queue(int c) { 
        front = rear = 0; 
        capacity = c; 
        queue = new int[capacity];
    }

    void isEmpty() {  
        if (front == rear) { 
            System.out.println("\nQueue is empty\n"); 
            return; 
        } else {
            System.out.println("\nQueue is not empty\n"); 
            return;  
        }
    }

    void Enqueue(int data) {
        if (capacity == rear) { 
            System.out.println("\nQueue is full\n"); 
            return; 
        }
        else { 
            queue[rear] = data; 
            rear++; 
        } 
        return; 
    }

    void Dequeue() {
        if (front == rear) { 
            System.out.println("\nQueue is empty\n"); 
            return; 
        }
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
            if (rear < capacity) 
                queue[rear] = 0;
            rear--; 
        } 
        return; 
    }

    void peak() { 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return;
    }

    void size() {
        System.out.println("\n" + rear);
        return;
    }

    void show() { 
        int i; 
        if (front == rear) { 
            System.out.println("\nQueue is Empty\n"); 
            return; 
        }
        for (i = front; i < rear; i++) { 
            System.out.println("\n" + queue[i]); 
        } 
        return; 
    } 
}

public class queueHW {
    public static void main(String[] args) {
        Queue queue1 = new Queue(2000);

        // Test enqueue
        queue1.Enqueue(14); 
        queue1.Enqueue(29); 
        queue1.Enqueue(31); 
        queue1.Enqueue(47);
        queue1.Enqueue(59); 
        
        // Test show and peak
        queue1.show();
        queue1.peak();

        // Test dequeue 
        queue1.Dequeue();
        queue1.show(); 

        // Test isEmpty
        queue1.isEmpty();

        // Test size
        queue1.size();
    }
}