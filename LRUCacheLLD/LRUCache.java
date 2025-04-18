import java.util.*;
public class LRUCache {
    Map<Integer,Node> cache;
    DoublyLinkedList dll;
    int capacity;
    LRUCache(int maxcapacity){
        this.capacity=maxcapacity;
        dll=new DoublyLinkedList();
        cache=new HashMap<>();
    }

    void put(int value){
        Node node = cache.get(value);
        if(node!=null){
            dll.moveToHead(node);
        }
        else{
            Node newNode = new Node(value);
            cache.put(value, newNode);
            dll.addToHead(newNode);
            if(cache.size()>capacity){
                Node tailNode = dll.removeTail();
                cache.remove(tailNode.value);
            }
        }
    }

    int get(int value){
        Node node = cache.get(value);
        if (node == null) {
            return -1;
        }
        dll.moveToHead(node);
        return node.value;

    }
    public static void main(String args[]){
        LRUCache lru = new LRUCache(2);
        lru.put(1);
        lru.put(2);
        System.out.println(lru.get(1));   // 1
        lru.put(3);                    // evicts key 2
        System.out.println(lru.get(2));   // -1
        lru.put(4);                    // evicts key 1
        System.out.println(lru.get(1));   // -1
        System.out.println(lru.get(3));   // 3
        System.out.println(lru.get(4));   // 4    
    }


}
