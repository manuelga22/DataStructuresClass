
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
        ArrayBag bag = new ArrayBag();
        
        File file = new File("assignment 1 test set.txt");
        
        try
        {
            Scanner in = new Scanner(file);

            String operation = "", item = "";
            int entryNumber = 0;
            while (in.hasNextLine())
            {
               entryNumber++;
               operation = in.next();
               if (!operation.equals("IS_EMPTY"))
               {
                   item = in.next();
                   System.out.println("\n" + operation + " " + item);
               }
               else System.out.println("\n" + operation);
                
                switch(operation)
                {
                    case "ADD": bag.add(item);
                                System.out.println(bag);
                                break;
                    case "COUNT": System.out.println("Number of \"" + item + "\": " + bag.count(item));
                                  break;
                    case "IS_EMPTY": System.out.println(bag.isEmpty());
                                     break;
                    case "REMOVE": bag.remove(item);
                                   System.out.println(bag);
                                   break;
                    default: System.out.println("Operation \"" + operation + "\" unknown at line " + entryNumber);
                             System.exit(1);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(1);
        }
    }
}
