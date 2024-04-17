public class LinkedQueue<T> {
    private Node<T> head;
    private Node<T> lastNode;

    public LinkedQueue(){
        this.head = new Node<>();
        this.lastNode = new Node<>();
    }
    public void offer(T data){
        Node<T> newNode = new Node<>(data);
        if(this.head.data == null){
            this.head = newNode;
        }else if(this.lastNode.data == null){
            this.lastNode = newNode;
            head.next = lastNode;
        }else{
            this.lastNode.next = newNode;
            this.lastNode = lastNode.next;
        }
    }
    public T poll(){
        if(this.lastNode == null){
            return null;
        }
        T data = this.head.data;
        if(this.head.next != null){
            this.head = this.head.next;
        }else{
            this.head = null;
            this.lastNode = null;
        }
        return data;
    }
    public T peek(){
        if(this.head != null) {
            return this.head.data;
        }else{
            return null;
        }
    }
}
