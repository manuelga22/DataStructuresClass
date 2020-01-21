/**
 * Expand the array in Program0802 to twice its size, after it has been filled with random numbers
 *  Use java.util.Arrays.copyOF
 */
import java.util.*;

public class Prog1101{

  public Prog1101() {
    int[] randomNum = fillArray();
    System.out.println(" og length " +randomNum.length);
    randomNum = expandArray(randomNum); //expand the size of the array
    System.out.println(" new length " +randomNum.length);

    System.out.println("average: " + getAverage(randomNum));
    System.out.println("minimum value: " + getMin(randomNum));
    System.out.println("maximum value: " + getMax(randomNum));
  }

  /**
   * twices the size of an array
   * @return the same array but with twice its size
   */
  public int [] expandArray(int [] array){
     int [] copy = Arrays.copyOf(array, array.length*2);
     return copy;
  }

  /**
   * calculates and returns the average of the numbers in the array
   * @param array (int)
   * @return the average of the numbers in the array
   */
  public double getAverage(int[] array) {
    double average = 0;
    for (int a = 0; a < array.length; a++) {
      average += array[a];
    }
    return average / array.length;
  }

  /**
   * returns he min value of an array
   * @param array
   * @return
   */
  public double getMin(int[] array) {
    double min = array[0];
    for (int a = 1; a < array.length; a++) {
      if (min > array[0])
        min = array[a];
    }
    return min;
  }
  /**
   * returns the max number of an array
   * @param array
   * @return
   */
  public double getMax(int[] array) {
    double max = array[0];
    for (int a = 1; a < array.length; a++) {
      if (max < array[a])
        max = array[a];
    }
    return max;
  }

  /**
   * method returns an array with 10 random numbers from [0-100)
   * @return a random array with 10 random numbers
   */
  public int[] fillArray() {
    Random random = new Random();
    int[] randomArray = new int[10];

    for (int a = 0; a < 10; a++) {
      randomArray[a] = random.nextInt(100);
    }

    return randomArray;
  }
  public static void main(String[]args){
    new Prog1101();
  }




}