package com.DataStructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mike on 12/8/2015.
 */
public class LinkedListTest2 {
    MyLinkedList linkedList;
   @Before
   public void setUp(){
       MyLinkedList linkedList = new MyLinkedList();
   }
    @Test
    public void testSizeEmpty() {
        MyLinkedList linkedList = new MyLinkedList();
        int size = linkedList.size();
        Assert.assertEquals(0, size);

    }

    @Test
    public void testSizeNotEmpty() {
        MyLinkedList linkedList = new MyLinkedList();
        Integer first =1;
        Integer second =2;
        linkedList.add(first);
        linkedList.add(second);

        Assert.assertEquals("Expected empty collection", 2,linkedList.size());

    }
}