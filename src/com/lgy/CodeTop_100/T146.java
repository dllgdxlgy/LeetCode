package com.lgy.CodeTop_100;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-07-22 20:37
 */
public class T146 {

    public static void main(String[] args) {
        LRUCache<Integer, Integer> cache = new LRUCache<>(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        System.out.println(cache.get(2));
    }
}

/**
 * 可以用, 带范型
 *
 * @param <K>
 * @param <V>
 */
class LRUCache<K, V> {

    private int capacity;
    private HashMap<K, Node> map;
    private Node<K, V> head;
    private Node<K, V> tail;

    class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev, next;

        public Node() {
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head = new Node<K, V>();
        tail = new Node<K, V>();
        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        Node<K, V> node = map.get(key);
        if (node == null) {
            return null;
        }
        moveNodeToHead(node);
        return node.value;

    }

    public void put(K key, V value) {
        Node<K, V> node = map.get(key);
        if (node == null) {
            if (map.size() >= capacity) {
                map.remove(tail.prev.key);
                removeTailNode();
            }
            Node<K, V> newNode = new Node<>(key, value);
            map.put(key, newNode);
            addToHead(newNode);
        } else {
            node.value = value;
            moveNodeToHead(node);
        }
    }

    private void addToHead(Node<K, V> node) {
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
        node.prev = head;
    }

    private void removeNode(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void removeTailNode() {
        removeNode(tail.prev);
    }

    private void moveNodeToHead(Node<K, V> node) {
        removeNode(node);
        addToHead(node);
    }
}

class LRUCache_1 {

    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head;
    private Node tail;

    class Node{
        int key;
        int value;
        Node prev,next;
        public Node(){}
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache_1(int capacity ){
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        Node node = map.get(key);
        if (node == null){
            return -1;
        }
        moveNodeToHead(node);
        return node.value;

    }
    public void put(int key,int value){
        Node node = map.get(key);
        if (node == null){
            if (map.size()>=capacity){
                map.remove(tail.prev.key);
                removeTailNode();
            }
            Node newNode = new Node(key,value);
            map.put(key,newNode);
            addToHead(newNode);
        }else {
            node.value = value;
            moveNodeToHead(node);
        }
    }

    private void addToHead(Node node){
        node.next = head.next;
        head.next = node;
        node.next.prev = node;
        node.prev = head;
    }
    private void removeTailNode(){
        removeNode(tail.prev);
    }

    private void moveNodeToHead(Node node){
        removeNode(node);
        addToHead(node);
    }
    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}
