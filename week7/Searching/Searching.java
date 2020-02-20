package Searching;


public class Searching {


  /**
   * @param list the array
   * @param x the element to search for
   * @return true if the element is there
   */
  public static boolean sequencialSearch(int []list, int x){
    boolean found = false;

    for(int a = 0; a<list.length;a ++){
      if(list[a]==x){
        found = true;
        break;
      }
    }
    if(found){
      return found;
    }else return false;
  }

  /**
   * @param list the array
   * @param x value you are searching
   * @return if it was found or not
   */
  public static boolean binarySearch(int[]list, int x) {
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


 /**
  * Algorithm that determines whether or not a given unsorted array of elements, list2, is completely contained within another 
  * unsorted array.
  */
  public static boolean unsortedContainment(int [] list1, int [] list2){
  
    for( int a = 0; a<list2.length; a++){
      if(!sequencialSearch(list1, list2[a])){
        return false;
      }
    }
    return true;
  }

   /**
  * Algorithm that determines whether or not a given sorted array of elements, list2, is completely contained within another 
  * sorted array.
  */
  public static boolean sortedContainment(int [] list1, int [] list2){
  
    for( int a = 0; a<list2.length; a++){
      if(!binarySearch(list1, list2[a])){// uses binary search since the two lists are sorted
        return false;
      }
    }
    return true;
  }



}