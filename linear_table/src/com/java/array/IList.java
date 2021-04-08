package com.java.array;

public interface IList {

    public void clear();

    public boolean isEmpty();

    public int length();

    public Object get(int i) throws Exception;

    /**
     * 在线性表第i个元素之前插入一个值为x的元素
     * @param i 0<=i<=length()
     * @param x
     * @throws Exception
     */
    public void insert(int i,Object x)throws Exception;

    public void remove(int i) throws Exception;

    public int indexOf(Object x);

    public void display();
}
