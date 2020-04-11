//Manuel Garcia 6142955
package assignment_3;
import java.util.Random;
public class Sort {
 
   
    public static boolean binarySearch(int[] list, int x) {
        int first = 0, last = list.length - 1, pivot;

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

    public static boolean sequentialSearch(int[] list, int x) {
        boolean found = false;

        for (int a = 0; a < list.length; a++) {
            if (list[a] == x) {
                found = true;
                break;
            }
        }
        if (found) {
            return found;
        } else
            return false;
    }

    public static boolean sortedSearch(int[] list, int x) {
       int i=0;
       while(i<list.length && list[i]<x){
           i++;
       }
       if( i<list.length && list[i]==x){
          return true;
       }else{
         return false;
       }  
    }

    public static void quicksort(int[] list) {
        if(list.length>0){
            quicksort(0, list.length - 1, list);
        } 

    }

    private static void quicksort(int begin, int end, int[] list) {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin, j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted) {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j) {
                // swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        // swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1)
            quicksort(begin, i - 1, list);
        if (i + 1 < end)
            quicksort(i + 1, end, list);
    }

    /*
     * Computes the pivot
     */
    private static int findPivotLocation(int b, int e) {
        return (b + e) / 2;
    }

    public static void fillArray(int[] list) {
        Random rnd = new Random();
        for(int a=0; a<list.length;a++){
            int random = rnd.nextInt(2000);
            list[a] = random;
        }
    }

    public static void printArray(int[] list) {
        for(int a=0;a<list.length;a++){
            System.out.print(list[a]+" ");
        }
    }

}