package com.DataStructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mike on 12/8/2015.
 */
public class LinkedListTest2 {
    MyLinkedLIst linkedList;
   @Before
   public void setUp(){
       MyLinkedLIst linkedList = new MyLinkedLIst();
   }
    @Test
    public void testSizeEmpty() {
        MyLinkedLIst linkedList = new MyLinkedLIst();
        int size = linkedList.size();
        Assert.assertEquals(0, size);

    }

    @Test
    public void testSizeNotEmpty() {
        MyLinkedLIst linkedList = new MyLinkedLIst();
        Integer first =1;
        Integer second =2;
        linkedList.add(first);
        linkedList.add(second);

        Assert.assertEquals("Expected empty collection", 2,linkedList.size());

    }
}