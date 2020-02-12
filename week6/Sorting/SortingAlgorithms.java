package Sorting;
import java.util.Random;
public class SortingAlgorithms {


public static void fillArray(int[]list){
  Random rand = new Random();
  
  for(int a = 0; a<list.length;a++){
    list[a] = rand.nextInt(20);
  }
}

public static int minimum(int[]list, int pos1, int length){
   int min = list[pos1];
   for(int a = pos1+1; a<length; a++){
     if(min> list[a]){
       min = list[a];
     }
   }
   return min;
}

public static void selectionSort(int[]list){
  for(int a = 0; a<list.length; a++){
     int minPos(list, a, list.length-1);
     swap(list, a , minPos);
   
  }
}

public static void insertionSort(int[] list){  
  for(int a = 1 ; a< list.length;a++){
    int temp = list[a];
    int j = a-1;
    while(j>=0 && temp<list[j]){
      list[j+1] = list[j];
      j--;
    }
    list[j+1] = temp;
  }
}


public static void bubbleSort(int [] list){
  
  for(int n = 0;n<list.length-1;n++){
    for(int j = 0; j<list.length-n-1;j++){
      if(list[j]> list[j+1]){
        int temp = list[j];
        list[j] = list[j+1];
        list[j+1] = temp;
      }
    }
  }

}

public static void print(int[]list){
  for(int a = 0; a<list.length; a++){
    System.out.print(" "+list[a]);
  }
}





}