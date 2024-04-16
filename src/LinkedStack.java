import java.util.EmptyStackException;

public class LinkedStack<T> {
    private Node<T> topNode;

    public LinkedStack(){
        this.topNode = new Node<>();

    }
    public void push (T data){
        if(topNode == null){
            topNode = new Node<>(data);
        }else {
            Node<T> newNode = new Node<>(data);
            newNode.next = this.topNode;
            this.topNode = newNode;
        }
    }
    public T pop (){
        if(topNode.data != null) {
            T data = topNode.data;
            this.topNode = this.topNode.next;
            return data;
        }else{
            throw new EmptyStackException();
        }
    }

    public T peek(){
        return topNode.data;
    }
    boolean isEmpty(){
        return topNode == null;
    }
    boolean hasNext(){
        return topNode.next != null;
    }

    public void printStack(){
        Node<T> tempNode = this.topNode;
        do{
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }while(tempNode.next != null);
    }
}
