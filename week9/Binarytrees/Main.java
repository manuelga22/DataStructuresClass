package Binarytrees;

import java.util.*;
public class Main{

 public Main(){
  BinarySearchTree tree = new  BinarySearchTree();
  Random rand = new Random(); 
  for(int a = 0;a<10;a++){
    int random = rand.nextInt(100);
    tree.add(random);
  }

  tree.postoderDisplay();


 }

 public static void main(String[]args){
   new Main();
 }
}