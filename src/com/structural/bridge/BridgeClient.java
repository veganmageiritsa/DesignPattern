package com.structural.bridge;

public class BridgeClient {


    public static void main(String[] args) {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        FifoCollection<Integer> collection=new Queue<>(list);
        collection.offer(10);
        collection.offer(25);
        collection.offer(13);
        Integer poll = (Integer) collection.poll();
        System.out.println(collection.poll());
    }


}
