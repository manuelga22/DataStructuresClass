package Sorting;

public class Prog19_01 {

public Prog19_01(){}
public static void main(String[]args){
  int [] list = new int[50];
  SortingAlgorithms.fillArray(list);
  SortingAlgorithms.print(list);
  SortingAlgorithms.bubbleSort(list);
  SortingAlgorithms.print(list);
  
  
  
  int [] list2 = new int[50];
  SortingAlgorithms.fillArray(list2);
  SortingAlgorithms.print(list2);
  SortingAlgorithms.insertionSort(list2);
  SortingAlgorithms.print(list2);
}


}