
public class Stack<T> {

    T[] elements;
    int top, size, delta, countExtensions;

    public Stack() {
        this(20, 10);
    }

    public Stack(int size, int delta) {
        if (size <= 0 || delta <= 0) {
            throw new IllegalArgumentException("Size and delta must be positive integers.");
        }
        elements = (T[]) new Object[size];
        this.size = size;
        this.delta = delta;
        top = countExtensions = 0;
    }

    public void push(T element) {
        if (top == size) {
            newelements = (T[]) new Object[size + delta];
            for (int i = 0; i < size; i++) {
                newelements[i] = elements[i];
            }
            elements = newelements;
            size += delta;
            countExtensions++;
        }
        elements[top++] = element;
    }

    public T pop() {
        if (top==0) {
            throw new IllegalStateException("Stack is empty.");
        }
        T element = elements[--top];
        elements[top] = null; // Clear reference for garbage collection
        return element;
    }

}
