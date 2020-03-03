
import java.util.Arrays;


/**
 * The class Deque implements an array-based double-ended queue.
 *
 * @author 6142955
 */
public class Deque
{
    private int SIZE, back, front, count;
    private []int  list;

    /**
     * Default constructor. Initial deque capacity is 10.
     */
    public Deque()
    {
        SIZE = 10;
        list = new int[SIZE];
        back = 0;
        front = SIZE;  
        count = 0;  
    }

    /**
     * Parameterized constructor. Initial deque capacity is "size".
     */
    public Deque(int size)
    {
         SIZE = size;
         list = new int[SIZE];
         back = 0;
         front = 0;  
         count = 0;  
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     * @return false if addition cannot be performed (i.e. the deque is full),
     * true otherwise
     */
    public boolean addToBack(int x)
    {
        if(back==front){
            return false;
        }else{
            count++;
             list[back] = x;
             back++;
             return true;
        }
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     * @return false if addition cannot be performed (i.e. the deque is full),
     * true otherwise
     */
    public boolean addToFront(int x)
    {
        if(back==front){   
            return false;
        }else{
            count++;
           list[front] = x;
           front--;
           return true;
        }
    }

    /**
     * Retrieves element on the back end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * back end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getBack()
    {
        if(back<=0){
            return new DequeItem();
        }else{
            return new DequeItem(true, list[back]);
        }
    }

    /**
     * Retrieves element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * front end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getFront()
    {
          if(front>=SIZE){
            return new DequeItem();
        }else{
            return new DequeItem(true, list[front]);
        }
    }

    /**
     * Determines if deque is empty. The method takes O(1) time.
     *
     * @return true if deque contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        if(count >0){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Determines if deque is full. The method takes O(1) time.
     *
     * @return true if deque has reached maximum capacity, false otherwise.
     */
    public boolean isFull()
    {
       if(front == back){
           return true;
       }
       return false;
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeBack()
    {
        if(back <=0){
            return false;
        }
        list[back]= "X";
        return true;
    }

    /**
     * Removes element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeFront()
    {
        if(front == SIZE){
            return false;
        }
        list[front]="X";
        return true;
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString()
    {
        String[] stringArray = new String[list.length];
        Arrays.fill(stringArray, "X");
        
        for (int i = 0; i < count; i++)
        {
            stringArray[(front + i) % SIZE] = Integer.toString(list[(front + i) % SIZE]);
        }

        return Arrays.toString(stringArray);
    }

    private int back;   //points to the last element of the deque
    private int count;  //number of elements in the deque
    private int front;  //points to the first element of the deque
    private int[] list; //array that stores the deque elements
    private int SIZE;   //deque capacity
}
