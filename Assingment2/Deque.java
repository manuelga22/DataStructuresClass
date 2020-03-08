
import java.util.Arrays;

/**
 * The class Deque implements an array-based double-ended queue.
 *
 * @author 6142955
 */
public class Deque {

    /**
     * Default constructor. Initial deque capacity is 10.
     */
    public Deque() {
        SIZE = 10;
        list = new int[SIZE];
        back = 0;
        front = 0;
        count = 0;
    }

    /**
     * Parameterized constructor. Initial deque capacity is "size".
     */
    public Deque(int size) {
        SIZE = size;
        list = new int[SIZE];
        back = 0;
        front = 0;
        count = 0;
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1) time.
     *
     * @param x new element to be added to the deque.
     * @return false if addition cannot be performed (i.e. the deque is full), true
     *         otherwise
     */
    public boolean addToBack(int x) {
        if (isFull()) {
            return false;
        } else {
           
            list[back] = x;
            back++;
            count++;
            return true;
        }
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1) time.
     *
     * @param x new element to be added to the deque.
     * @return false if addition cannot be performed (i.e. the deque is full), true
     *         otherwise
     */
    public boolean addToFront(int x) {
        if(isFull()){
        return false;
        }else{
        if (front == 0) {
            front = SIZE - 1;
        } else {
            front = (front - 1) % SIZE;
        }

        list[front] = x;
        count++;
        return true;
      }
    }

    /**
     * Retrieves element on the back end of the deque. The method takes O(1) time.
     *
     * @return operation is successful: valid = true and item = element on the back
     *         end; operation is unsuccessful (i.e. empty deque): valid = false and
     *         item = dummy value
     */
    public DequeItem getBack() {
        if (isEmpty()) {
            return new DequeItem();
        } else {
            return new DequeItem(true, list[back-1]);
        }
    }

    /**
     * Retrieves element on the front end of the deque. The method takes O(1) time.
     *
     * @return operation is successful: valid = true and item = element on the front
     *         end; operation is unsuccessful (i.e. empty deque): valid = false and
     *         item = dummy value
     */
    public DequeItem getFront() {
        if (isEmpty()) {
            return new DequeItem();
        } else {
            return new DequeItem(true, list[front]);
        }
    }

    /**
     * Determines if deque is empty. The method takes O(1) time.
     *
     * @return true if deque contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Determines if deque is full. The method takes O(1) time.
     *
     * @return true if deque has reached maximum capacity, false otherwise.
     */
    public boolean isFull() {
        return count == SIZE;
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty), true
     *         otherwise
     */
    public boolean removeBack() {
        if (isEmpty()) {
            return false;
        }
        back--;
        count--;
        return true;
    }

    /**
     * Removes element on the front end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty), true
     *         otherwise
     */
    public boolean removeFront() {
        if (isEmpty()) {
            return false;
        }
        front++;
        count--;
        return true;
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString() {
        String[] stringArray = new String[list.length];
        Arrays.fill(stringArray, "X");

        for (int i = 0; i < count; i++) {
            stringArray[(front + i) % SIZE] = Integer.toString(list[(front + i) % SIZE]);
        }

        return Arrays.toString(stringArray);
    }

    private int back; // points to the last element of the deque
    private int count; // number of elements in the deque
    private int front; // points to the first element of the deque
    private int[] list; // array that stores the deque elements
    private int SIZE; // deque capacity
}
