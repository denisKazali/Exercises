public class linkedListt<T> {
    private Node<T> headNode;
    private Node<T> currentNode;

    public void addItemAtEnd(T data){
        Node<T> newNode = new Node<>(data);
        if(headNode == null){
            headNode = newNode;
            currentNode = headNode;
        }else{
            if(currentNode == null){
                currentNode = headNode;
            }
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void addItemAtStart (T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = headNode;
        headNode = newNode;
    }

    public void addItemAtIndex(T data, Node<T> head, int index) {
        int length = getLength(head);
        if(index < length && index >=0) {
            Node<T> newNode = new Node<>(data);
            Node<T> prevNode = getItemAtGivenIndex(head, index);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public void deleteHeadNode(Node<T> head){
        headNode = head.next;
        head = null;
    }

    public void deleteLastNode(Node<T> head){
        int length = getLength(head);
        if(length >= 2) {
            length--;
            Node<T> secondToLastNode = getItemAtGivenIndex(head, length - 1);
            Node<T> lastNode = secondToLastNode.next;
            secondToLastNode.next = null;
            lastNode = null;
        }else{
            System.out.println("Only the head is left");
        }
    }

    public void deleteItemAtGivenIndex(Node<T> head, int index){
        int length = getLength(head);
        if(index >= 1 && index < length){
            Node<T> currNode = getItemAtGivenIndex(head, index);
            Node<T> prevNode;
            if(index == 1){
                prevNode = head;
            }else{
                prevNode = getItemAtGivenIndex(head, index-1);
            }
            prevNode.next = currNode.next;
            currNode = null;

        }else if(index == 0){
            System.out.println("Use .deleteHeadNode instead");
        }else{
            System.out.println("Index out of bounds");
        }
    }
    public Node<T> getHeadNode(){
        return this.headNode;
    }

    public void print(Node<T> head){

        if(head != null){
            Node<T> currNode = head;
            System.out.println(currNode.data);
            while (currNode.next != null){
                System.out.println(currNode.next.data);
                currNode = currNode.next;
            }
        }
    }

    public int getLength(Node<T> head){
        int length = 0;
        if(head != null){
            length++;
            Node<T> currNode = head;
            while (currNode.next != null){
                length++;
                currNode = currNode.next;
            }
        }
        return length;
    }

    public Node<T> getItemAtGivenIndex(Node<T> head, int index){
        int currIndex = 0;
        Node<T> currNode;
        if(head != null){
            currNode = head;
            while (currIndex < index){
                currNode = currNode.next;
                currIndex++;
            }
            return currNode;
        }else return null;
    }

}
