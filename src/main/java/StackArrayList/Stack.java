package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;
    Integer counter = 0;

    public Stack(){
        this.elements = new ArrayList();
    }

    public Boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(E object) {
        if (elements.isEmpty()){
            elements.add(object);
        }
        else {
            elements.add(object);
            counter++;
        }
    }

    public E pop() {
        E element;
        if (!elements.isEmpty()){
            element = (E) elements.get(counter);
            elements.remove(element);
            counter--;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
        return element;
    }
}
