package Prog18_01;

import java.util.Date;
import java.util.Random;

/**
 * Desing and implement an experiment to time the minimum algorithm for several
 * sizes of the input
 */
public class Prog18_01 {
  private Date current;
  private Random random= new Random();

  public Prog18_01(){

    int[] array = new int[100000000];
   
    for(int a=0; a<array.length;a++){
      array[a]= random.nextInt();
    }
    
    current= new Date();
    long startTime= current.getTime();
    
    minimum(array,array.length );
    
    current= new Date();
    long stopTime = current.getTime(); 

    System.out.println("it lasted "+ (long)(stopTime - startTime));
  }

  /**
   * calculate the minimum
   * @param a
   * @param n
   * @return
   */
  public int minimum(int a[], int n){
     int min = a[0];
     for(int b = 0; b<a.length;b++){
       if(min > a[b]){
         min = a[b];
       }
     }
     return min;

  }



public static void main(String[]args){

 new Prog18_01();
  
}



}