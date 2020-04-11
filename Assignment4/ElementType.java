
/**
 * Elements in the nodes of the symbol table.
 *
 * @author Prof. Hernandez
 */

public class ElementType
{
    public String identifier;  // identifier name
    public String access;      // access modifier

    /**
     * Default constructor. Sets this object to a default element type.
     *
     */
    public ElementType()
    {
        identifier = "info";
        access = "private";
    }

    /**
     * Parameterized constructor.
     *
     * @param i value of the "identifier" component of this object
     * @param a value of the "access" component of this object
     */
    public ElementType(String i, String a)
    {
        identifier = i;
        access = a;
    }

    /**
     * Constructs a String description of this ElementType object.
     *
     * @return String containing the info of this ElementType object
     */
    public String toString()
    {
        return "[" + identifier + " | " + access + "]";
    }
}