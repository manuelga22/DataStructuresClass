package week7;
import java.util.Random;

public class SortingAlgorithms2 {

  public static void fillArray(int[] list) {
    Random rand = new Random();

    for (int a = 0; a < list.length; a++) {
      list[a] = rand.nextInt(20);
    }
  }

  public static int minimum(int[] list, int pos1, int length) {
    int min = list[pos1];
    for (int a = pos1 + 1; a < length; a++) {
      if (min > list[a]) {
        min = list[a];
      }
    }
    return min;
  }

  public static void selectionSort(int[] list) {
    for (int a = 0; a < list.length; a++) {
      int minPos = minimum(list, a, list.length - 1);
      swap(list, a, minPos);
    }
  }


  
  public static void mergeSort(int[] list, int[] list2, int[] list3) {
    int bPtr = 0;
    int ePtr = 0;
    int i = 0;
    while (bPtr != list.length && ePtr != list2.length) {
      if (list[bPtr] < list2[ePtr]) {
        list3[i] = list[bPtr];
        bPtr++;
      } else {
        list3[i] = list2[ePtr];
        ePtr++;
      }
      i++;
    }
    if (bPtr == list.length) {
      while (ePtr != list2.length) {
        list3[i] = list2[ePtr];
        ePtr++;
        i++;
      }
    }
    if (ePtr == list2.length) {
      while (bPtr != list.length) {
        list3[i] = list[bPtr];
        bPtr++;
        i++;
      }
    }

  }

  public static void insertionSort(int[] list) {
    for (int a = 1; a < list.length; a++) {
      int temp = list[a];
      int j = a - 1;
      while (j >= 0 && temp < list[j]) {
        list[j + 1] = list[j];
        j--;
      }
      list[j + 1] = temp;
    }
  }

  public static void bubbleSort(int[] list) {

    for (int n = 0; n < list.length - 1; n++) {
      for (int j = 0; j < list.length - n - 1; j++) {
        if (list[j] > list[j + 1]) {
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }

  }

  public static void print(int[] list) {
    for (int a = 0; a < list.length; a++) {
      System.out.print(" " + list[a]);
    }
  }
}