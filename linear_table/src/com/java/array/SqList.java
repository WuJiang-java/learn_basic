package com.java.array;

public class SqList implements IList{

    private Object[] listElem;  //线性表存储空间
    private int curLen; //线性表当前长度

    /**
     * 构造一个存储容量为maxSize的线性表
     * @param maxSize
     */
    public SqList(int maxSize) {
        curLen=0;
        listElem=new Object[maxSize];
    }

    @Override
    public void clear() {
        curLen=0;
    }

    @Override
    public boolean isEmpty() {
        return curLen==0;
    }

    @Override
    public int length() {
        return curLen;
    }

    /**
     * 读取线性表的第i个元素并返回
     * @param i
     * @return
     * @throws Exception
     */
    @Override
    public Object get(int i) throws Exception {
        if(i<0||i>curLen-1) throw new Exception("第"+i+"个元素不存在");
        return listElem[i];
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        if(curLen==listElem.length) throw new Exception("顺序表已满");

        if(i<0||i>curLen) throw new Exception("插入位置不合法");

        for (int j = curLen-1; j >i ; j--) {
            listElem[j]=listElem[j-1];
        }
        listElem[i]=x;
        curLen++;
    }

    @Override
    public void remove(int i) throws Exception {
        if (i<0||i>curLen-1) throw new Exception("删除位置不合法");

        for (int j=i;j<curLen-1;j++){
            listElem[j]=listElem[j+1];
        }
        curLen--;
        System.out.println("害怕");
    }

    @Override
    public int indexOf(Object x) {
        int j=0;
        while (j<curLen&&!listElem[j].equals(x)) j++;

        if(j<curLen) return j;
        else return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < curLen; i++) {
            System.out.println(listElem[i]+"");
        }
        System.out.println();

    }

}
