

public class Main {
    public static void main(String[] args) {
        /*
        //Linked List:

        linkedListt<Integer> list = new linkedListt<>();
        list.addItemAtStart(1);
        list.addItemAtEnd(3);
        list.addItemAtStart(2);
        list.addItemAtEnd(6);
        Node<Integer> head = list.getHeadNode();
        list.addItemAtIndex(8, head, 3);

        System.out.println("Head Node: " + head.data);
        list.print(head);

        System.out.println("Deleting item at index 3");
        list.deleteItemAtGivenIndex(head, 3);
        list.print(head);

        System.out.println("Deleting Head");
        list.deleteHeadNode(head);
        head = list.getHeadNode();
        System.out.println("New Head: " + head.data);
        list.print(head);

        System.out.println("Deleting Last Item");
        list.deleteLastNode(head);
        list.print(head);

        System.out.println("Deleting Last Item");
        list.deleteLastNode(head);
        list.print(head);

        //Linked Stack:

        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        System.out.println("Pushed: " + stack.peek());
        stack.push(2);
        System.out.println("Pushed: " + stack.peek());
        stack.push(3);
        System.out.println("Pushed: " + stack.peek());
        stack.push(4);
        System.out.println("Pushed: " + stack.peek());
        stack.push(5);
        System.out.println("Pushed: " + stack.peek());
        stack.push(6);
        System.out.println("Pushed: " + stack.peek());

        System.out.println("Printing the stack with .printStack() function:");

        stack.printStack();

        System.out.println("Stack Length: " + stack.length());

        System.out.println("Printing the stack with .pop() function:");

        while(stack.hasNext()){
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Stack Length: " + stack.length());
        System.out.println("Is the Stack empty: " + stack.isEmpty());
        System.out.println("Peek: " + stack.peek());
        */
        //Linked Queue:

        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("First in line: " + queue.peek());
        System.out.println("Poll: " + queue.poll());


    }
}