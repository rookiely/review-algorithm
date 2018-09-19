package LRUcache;

import java.util.Hashtable;

public class LRU {

    class DlinkNode{
        int val,key;
        DlinkNode pre,post;
    }

    int capacity,count;
    DlinkNode head,tail;
    Hashtable<Integer, DlinkNode> cache = new Hashtable<>();

    public LRU(int capacity){
        this.count = 0;
        this.capacity = capacity;
        head = new DlinkNode();
        head.pre = null;
        tail = new DlinkNode();
        tail.post = null;
        head.post = tail;
        tail.pre = head;
    }

    public void addNode(DlinkNode node) {
        //只对指针操作，就不会出错
        node.post = head.post;
        node.pre = head;

        head.post.pre = node;
        head.post = node;
    }

    public void removeNode(DlinkNode node) {
        node.pre.post = node.post;
        node.post.pre = node.pre;
    }

    public void moveToHead(DlinkNode node){
        if(node == head.post) return;
        this.removeNode(node);
        this.addNode(node);
    }

    public DlinkNode popTail(){
        //因为这里双向链表的head和tail都是用来作为标志的
        DlinkNode node = tail.pre;
        this.removeNode(node);
        return node;
    }

    public void put(int key, int val) {
        DlinkNode node = cache.get(key);
        if (node == null) {
            DlinkNode newNode = new DlinkNode();
            newNode.val = val;
            newNode.key = key;
            cache.put(key, newNode);
            ++count;
            if (count > this.capacity) {
                DlinkNode tem = this.popTail();
                this.cache.remove(tem.key);
                --count;
            }
        }else{
            node.val = val;
            this.moveToHead(node);
        }
    }

    public int get(int key) {
        DlinkNode node = this.cache.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.val;
    }

}
