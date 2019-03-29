package com.structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T> {


    private Node node;
    private Node top;
    private Node last;
    private int size;
    public SinglyLinkedList(Node node) {
        this.node = node;
        this.size=0;
    }

    public SinglyLinkedList() {
    }

    @Override
    public void addFirst(T element) {
       if(top==null)
           last=top=new Node(element,null);
       else{
           top = new Node(element,top);
       }
       size++;
    }

    @Override
    public void addLast(T element) {
        Node nodeLast = new Node(element, null);
        Node temp = top;

        if (top == null) {
            last=top=nodeLast;
        }
        else {
            // loop until we find the end of the list
            while ((temp.getNext() != null)) {
                temp = temp.getNext();
            }
            temp.setNext(nodeLast);
            last = nodeLast;
        }
        size++;

    }

    @Override
    public T removeFirst() {
       if(top==null)
           return null;
       else
           return (T) top.getData();
    }

    @Override
    public T removeLast() {
        if(last==null)
            return null;
        return (T) last.getData();
    }


    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
