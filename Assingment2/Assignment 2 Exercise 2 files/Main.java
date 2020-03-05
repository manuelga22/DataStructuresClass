
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tester class.
 *
 * @author Prof. A. Hernandez
 */
public class Main
{

    public static void main(String[] args)
    {
        new Main();
    }

    /**
     * Tester method.
     */
    public Main()
    {
        Deque deque = new Deque();

        File file = new File("assignment 2 exercise 2 test set.txt");

        try
        {
            Scanner in = new Scanner(file);

            String operation;
            int item = 0;
            int entryNumber = 0;
            while (in.hasNextLine())
            {
                entryNumber++;
                operation = in.next();
                if (operation.equals("ADD_TO_BACK") || operation.equals("ADD_TO_FRONT"))
                {
                    item = in.nextInt();
                    System.out.println("\n" + operation + " " + item);
                }
                else
                    System.out.println("\n" + operation);

                DequeItem result;
                switch (operation)
                {
                    case "ADD_TO_BACK":
                        deque.addToBack(item);
                        System.out.println(deque);
                        break;

                    case "ADD_TO_FRONT":
                        deque.addToFront(item);
                        System.out.println(deque);
                        break;

                    case "GET_BACK":
                        result = deque.getBack();
                        if (result.valid)
                            System.out.println("Back item: " + result.item);
                        else
                            System.out.println("Cannot retrieve value, deque is empty!");
                        break;

                    case "GET_FRONT":
                        result = deque.getFront();
                        if (result.valid)
                            System.out.println("Front item: " + result.item);
                        else
                            System.out.println("Cannot retrieve value, deque is empty!");
                        break;

                    case "IS_EMPTY":
                        System.out.println(deque.isEmpty());
                        break;

                    case "REMOVE_BACK":
                        if (deque.removeBack())
                            System.out.println(deque);
                        else
                            System.out.println("Cannot remove, deque is empty!");
                        break;

                    case "REMOVE_FRONT":
                        if (deque.removeFront())
                            System.out.println(deque);
                        else
                            System.out.println("Cannot remove, deque is empty!");
                        break;

                    default:
                        System.out.println("Operation \"" + operation + "\" unknown at line " + entryNumber);
                        System.exit(1);
                }
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(1);
        }
    }
}
