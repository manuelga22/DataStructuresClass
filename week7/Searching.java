package week7;


public class Searching {

  /**
   * @param list the array
   * @param x value you are searching
   * @return if it was found or not
   */
  public static boolean binarySearch(int[]list, int x) {
    int first = 0, last = n - 1, pivot;

    boolean found = false;

    while (first <= last && !found) {
      pivot = (first + last) / 2;
      if (list[pivot] == x)
        found = true;
      else if (x < list[pivot]) {
        last = pivot - 1;
      } else {
        first = pivot + 1;
      }

    }

    return found;


  }

}