public class DoublyLinkedList {
    Node head;
    Node tail;
    DoublyLinkedList(){
        head=new Node(0);
        tail=new Node(0);
        head.next=tail;
        tail.prev=head;
    }

    void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }

    void addToHead(Node node){

        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    void moveToHead(Node node) {
        removeNode(node);  // First remove it from its current position
        addToHead(node);   // Then re-add it to the head
    
    }

    Node removeTail(){
        Node node = tail.prev;
        removeNode(node);
        return node;
    }
}
