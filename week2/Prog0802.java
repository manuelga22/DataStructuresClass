import java.util.Random;

/**
 * Java program that fills an array of 10 numbers with random integers in
 * [0,100) and displays it. The program will calculate the average of the
 * numbers in the array, the minimum, and the maximum and will display them.
 * 
 */
public class Prog0802 {
  public Prog0802() {
    int[] randomNum = fillArray();
    System.out.println("average: " + getAverage(randomNum));
    System.out.println("minimum value: " + getMin(randomNum));
    System.out.println("maximum value: " + getMax(randomNum));
  }

  /**
   * calculates and returns the average of the numbers in the array
   * 
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
   * 
   * @param array
   * @return
   */
  public int getMin(int[] array) {
    double min = array[0];
    for (int a = 1; a < array.length; a++) {
      if (min > array[0])
        min = array[a];
    }
    return min;
  }

  /**
   * returns the max number of an array
   * 
   * @param array
   * @return
   */
  public int getMax(int[] array) {
    double max = array[0];
    for (int a = 1; a < array.length; a++) {
      if (max < array[a])
        max = array[a];
    }
    return max;
  }

  /**
   * method returns an array with 10 random numbers from [0-100)
   * 
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

  public static void main(String args[]) {

    new Prog0802();

  }
}