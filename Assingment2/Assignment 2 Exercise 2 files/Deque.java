
/**
 * The class Deque implements a double-ended queue with a doubly linked list.
 * The list uses a header and a trailer (dummy) nodes.
 *
 * @author (add here your Panther ID)
 */
public class Deque
{

    /**
     * Default constructor. Sets this object as an empty deque.
     *
     */
    public Deque()
    {
        front = new Node();
        back = new Node();
        front.setNext(back);
        back.setPrev(front);
        count = 0;
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToBack(int x)
    {
        Node newNode = new Node(x);
        if(isEmpty()){
            back = newNode;
        }else{
            front.setPrev(newNode);
        }
        newNode.setNext(front);
        front = newNode;
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToFront(int x)
    {
        Node newNode = new Node(x);
        if(isEmpty()){
            head = newNode;
        }else{
            back.setNext(x)
            newNode.setPrev(back)
        }
        newNode.setNext(front);
        back = newNode;
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
            if(isEmpty()){
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
            if(isEmpty()){
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
        return front==null;   //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeBack()
    {
         if(front == null){
            System.out.println("Deque is empty")
            return false;
         }
  
         if(front.getNext() == null){
          back = null;
         }else{
      
        head.getNext().setPrev(null)
       }
        back = back.prev;
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
          if(back == null){
            System.out.println("Deque is empty")
            return false;
         }
      
         if(front.getNext() == null){
          head = null;
         }else{
      
        back.prev.next = null;
       }
        tail = tail.prev;
        return true;
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString()
    {
        String str = "";

        Node current = front.getNext();
        for (int i = 0; i < count - 1; i++)
        {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (count != 0)
            return "Deque: [" + str + back.getPrev().getInfo() + "]";
        else
            return "Deque: []";
    }

    private int count;  //number of elements in the deque
    private Node back;  //points to the item in the back
    private Node front; //points to the item in the front
}
