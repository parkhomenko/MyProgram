package com.DataStructures;

import java.util.List;

/**
 * Created by Mike on 12/5/2015.
 */
public class MyLinkedList {
    private Element firstElement;

    public MyLinkedList() {
        firstElement = null;

    }

    private int size() {
        int size = 0;
        Element currentElement = firstElement;
        while (currentElement != null) {
            currentElement = firstElement.next;
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (firstElement == null)
            return true;
        else return false;
    }

    public boolean contains(Object obj) {
        Element currentElement = firstElement;
        while (currentElement != obj && currentElement != null) {
            currentElement = firstElement.next;
        }
        if (currentElement == obj)
            return true;
        else return false;

    }

    public Object[] toArray() {
        Object[] arrayOfElements = new Object[size()];
        for (int i = 0; i < arrayOfElements.length; i++) {
            arrayOfElements[i] = firstElement.next;
        }
        return arrayOfElements;
    }

    public void clear() {
        firstElement.next = null;
        firstElement.data = null;

    }


}

