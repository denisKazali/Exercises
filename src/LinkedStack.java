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
            if(!this.hasNext()){
                this.topNode = null;
            }
            return data;
        }else{
            throw new EmptyStackException();
        }
    }
    public T peek(){
        if(this.isEmpty()){
            return null;
        }else {
            return topNode.data;
        }
    }
    boolean isEmpty(){
        return this.topNode == null;
    }
    boolean hasNext(){
        if(this.topNode == null){
            return false;
        }else{
            return this.topNode.next != null;
        }
    }
    public void printStack(){
        if(this.isEmpty()){
            throw  new EmptyStackException();
        }else {
            Node<T> tempNode = this.topNode;
            do {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            } while (tempNode.next != null);
        }
    }
    public int length(){
        if(this.isEmpty()){
            return 0;
        }else {
            int len = 0;
            Node<T> currentNode = this.topNode;
            while (currentNode.next != null) {
                len++;
                currentNode = currentNode.next;
            }

            return len;
        }
    }

}
