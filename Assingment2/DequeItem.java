
/**
 * Return value of methods getBack and getFront in the Deque class.
 *
 * @author Prof. Hernandez
 */
public class DequeItem
{

    /**
     * Default constructor. Sets this object to a invalid deaue item.
     *
     */
    public DequeItem()
    {
        valid = false;
        item = 0;
    }

    /**
     * Parameterized constructor.
     *
     * @param v value of the "valid" component of this object
     * @param i value of the "item" component of this object
     */
    public DequeItem(boolean v, int i)
    {
        valid = v;
        item = i;
    }

    public boolean valid; //true if "item" is a valid element, false otherwise
    public int item;      //deque element
}
