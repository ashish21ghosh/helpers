import java.util.Iterator;
import java.util.Arrays;
import java.util.NoSuchElementException;


interface Stack {
    boolean isEmpty();
    void push(Object item);
    Object peek();
    Object pop();
    int size();
}


public class DynamicArrayStack<Item> implements Stack<Item>, Iterable<Item> {
    private Item[] arr;
    private int n;

    public DynamicArrayStack() {
        n = 0;
        arr = (Item[]) new Object[4];
    }

    /**
     * Checks if stack is empty.
     * @return true if empty false otherwise
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * @return the number of items in this stack
     */
    public int size() {
        return n;
    }

    /**
     * shows the top most item of this stack
     * @return top most item of this stack
     * @throws java.util.NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Empty Stack"); 
        return arr[n-1];
    }

    private void resize(int capacity) {
        assert capacity >= n;
        Item[] copy = Arrays.copyOf(arr, capacity);
        arr = copy;
    }

    public void push(Item item) {
        // double the size of array if necessary
        if (n == arr.length) resize(2*arr.length);
        arr[n++] = item;
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Empty Stack");
        // shrink the size if necessary
        // keep it half empty to allow push(item) without doubling size
        if (n > 1 && n == arr.length/4) resize(arr.length/2);
        Item item = arr[n-1];
        arr[--n] = null;
        return item;
    }
}