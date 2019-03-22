package StackArray;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private Integer size;

    public GenericStack() {
        elements = (E[]) new Object[10];
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

    public E[] doubleSize(){
        E[] temp = (E[]) new Object[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        return temp;
    }

    public E pop() {
        E answer = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return answer;
    }
}
