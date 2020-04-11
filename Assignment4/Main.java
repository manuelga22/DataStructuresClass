
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tester class.
 * 
 * @author Prof. Hernandez
 */
public class Main
{
    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        SymbolTable table = new SymbolTable();

        int arrayCapacity = 100;
        String[] identifier = new String[arrayCapacity];
        String[] access = new String[arrayCapacity];

        File file = new File("assignment 4 input.txt");

        try
        {
            Scanner in = new Scanner(file);

            int entryNumber = 0;
            while (in.hasNextLine())
            {
                identifier[entryNumber] = in.next();
                access[entryNumber] = in.next();

                entryNumber++;
            }

            //add all array elements to the symbol table
            for (int i=0; i<entryNumber; i++)
            {
                table.add(new ElementType(identifier[i], access[i]));
            }

            //search and remove middle third of array elements
            for (int i=entryNumber/3; i<2*entryNumber/3; i++)
            {
                if (table.search(identifier[i]))
                    table.remove(identifier[i]);
            }

            System.out.println("\n SYMBOL TABLE\n\n" + table);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(1);
        }
    }
}