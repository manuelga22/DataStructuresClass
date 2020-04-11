import javax.sound.sampled.SourceDataLine;

/**
 * The class LinkedList implements a singly linked list of ElementType The list
 * uses a header (dummy) node.
 *
 * @author (add here your Panther ID)
 */
public class LinkedList {

    private Node first; // dummy header node

    /**
     * Default constructor. Sets this object as an empty list.
     *
     */
    public LinkedList() {
        first = new Node();
    }

    /**
     * Adds new element as the first element of the list.
     *
     * @param x element to be added to the list
     */
    public void add(ElementType x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    /**
     * Determines if linked list is empty.
     *
     * @return true if list contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    /**
     * Removes given element from the list.
     *
     * @param x element to be removed
     */
    public void remove(String x) {
        Node old = first.getNext(), p = first;
        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo().identifier.equals(x)) {
                found = true;
            } else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }

    }

    /**
     * Determines if a given element is in the list.
     *
     * @param x element to be searched
     * @return true if x is in the list, false otherwise
     */
    public boolean search(String x) {
        Node current = first.getNext();
        
        while (current != null) {
       
            if (current.getInfo().identifier.equals(x)) {
                return true;
            }
            current = current.getNext();
        }

   
        return false;
    }

    /**
     * Constructs a String description of the list.
     *
     * @return String containing the list elements.
     */
    public String toString() {
        Node current = first.getNext();

        String str = "";
        while (current != null) {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }

        return str;
    }

}
