package com.java.list;

public class Node {
    private Object data;
    private Node next;

    public Node(){
        this(null,null);
    }

    public Node(Object data){
        this(data,null);
    }

    public Node(Object data,Node next){

    }
}
