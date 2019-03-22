package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private Integer size;

    public ObjectStack() {
        elements = new Object[10];
        size = 0;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void push(E object) {
        if (size != elements.length){
            elements[size] = object;
        }
        else {
            elements = doubleSize();
        }
        size++;
    }

    private Object[] doubleSize() {
        Object[] temp = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];

        }
        return temp;
    }

    public Object pop() {
        Object answer = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return answer;
    }
}
