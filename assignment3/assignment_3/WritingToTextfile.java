//Manuel Garcia 6142955
package assignment_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
* Illustrates how to create textfile in Java program
* @author Prof. A. Hernandez
*/
public class WritingToTextfile
{
    public static void main(String[] args)
    {

        String outputFilename = "output.csv";
 
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex)
        {
            System.exit(1);
        }

        Random rnd = new Random();
        long startTime1, elapsedTime1,startTime2, elapsedTime2, startTime3, elapsedTime3;
       
        int n = 5000;
        for (int i = 0; i < n; i++)
        {
            int length = rnd.nextInt(2000);
            int [] list = new int[length];
            Sort.fillArray(list);
            int num = rnd.nextInt(2000);

            startTime2= System.nanoTime();
            Sort.sequentialSearch(list, num);
            elapsedTime2= System.nanoTime() -startTime2;
            
            Sort.quicksort(list); 

            startTime1= System.nanoTime();
            Sort.binarySearch(list, num);
            elapsedTime1= System.nanoTime() -startTime1;

            startTime3= System.nanoTime();
            Sort.sortedSearch(list, num);
            elapsedTime3= System.nanoTime() -startTime3;

            output.println(length+ "," + elapsedTime1+ "," + elapsedTime2+ "," + elapsedTime3);
        }
        //close output stream
        output.close();
    }
}