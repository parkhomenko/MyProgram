package com.DataStructures;

import java.util.Iterator;

/**
 * Created by Mike on 12/15/2015.
 */

    public class MyLinkedListIterator implements Iterator<Object> {
        private Element currentElement;
        public MyLinkedListIterator(Element element) {
            this.currentElement = element;
        }

        @Override
        public boolean hasNext() {
            return currentElement!=null;
        }

        @Override
        public Object next() {
            Object toReturn = currentElement.data;
            currentElement = currentElement.next;
            return toReturn;
        }
    }

