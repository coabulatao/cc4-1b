import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the data structure:\n1. Stack\n2. Queue\nEnter your choice: "); 
        int choice = scanner.nextInt(); 
        if (choice == 1) { 
            System.out.print("Enter the maximum capacity of the stack: "); 
            int capacity = scanner.nextInt();
            stackOperations(capacity, scanner);
        } else if (choice == 2) { 
            System.out.print("Enter the maximum capacity of the queue: ");
            int capacity = scanner.nextInt();
            queueOperations(capacity, scanner);
        } else {
            System.out.println("Invalid choice. Please enter '1' for Stack or '2' for Queue.");
        }
        scanner.close();
    }

    public static void stackOperations(int capacity, Scanner scanner) {
        Stack<Integer> stack = new Stack<>();
        int action = 0;
        while (action != 3) {
            System.out.print("Choose operation:\n1. Push\n2. Pop\n3. Finish\nEnter your choice: ");
            action = scanner.nextInt();
            if (action == 1) { 
                if (stack.size() < capacity) {   
                    System.out.print("Enter item to push into the stack: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    System.out.println("Pushed " + item + " into the stack.");
                } else {
                    System.out.println("The stack is full.");
                }
            } else if (action == 2) { 
                if (!stack.isEmpty()) {
                    System.out.println("Popped " + stack.pop() + " from the stack.");
                } else {
                    System.out.println("The stack is empty.");
                }
            } else if (action != 3) {
                System.out.println("Invalid choice.");
            }
        }
        System.out.println("Final stack content: " + stack);
    }

    public static void queueOperations(int capacity, Scanner scanner) {
        Queue<Integer> queue = new LinkedList<>();
        int action = 0;
        while (action != 3) {
            System.out.print("Choose operation:\n1. Enqueue\n2. Dequeue\n3. Finish\nEnter your choice: ");
            action = scanner.nextInt();
            if (action == 1) { 
                if (queue.size() < capacity) {
                    System.out.print("Enter item to enqueue: ");
                    int item = scanner.nextInt();
                    queue.offer(item);
                    System.out.println("Enqueued " + item + " into the queue.");
                } else {
                    System.out.println("The queue is full.");
                }
            } else if (action == 2) { 
                if (!queue.isEmpty()) {
                    int dequeuedItem = queue.poll();
                    System.out.println("Dequeued " + dequeuedItem + " from the queue.");
                } else {
                    System.out.println("The queue is empty.");
                }
            } else if (action == 3) {
                System.out.println("Finishing queue operations.");
                break; 
            } else {
                System.out.println("Invalid choice.");
            }
        }
        System.out.println("Final queue content: " + queue);
    }
}
