
/**
 * Implements the node of a singly linked list of ElementType.
 *
 * @author (add here your Panther ID)
 */
public class Node
{

    private ElementType info; // element stored in this node
    private Node next;        // link to next node in the list

    /**
     * Default constructor. Creates a default node object.
     */
    public Node()
    {
        info = null;
        next = null;
    }

    public void setInfo(ElementType x)
    {
        info = x;
    }

    public void setNext(Node l)
    {
        next = l;
    }

    public ElementType getInfo()
    {
        return info;
    }

    public Node getNext()
    {
        return next;
    }
}
