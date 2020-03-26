package Binarytrees;

import java.util.*;
public class Main{

 public Main(){
  BinarySearchTree tree = new  BinarySearchTree();
  Random rand = new Random(); 
  for(int a = 0;a<10;a++){
    int random = rand.nextInt(5);
    tree.add(random);
  }
  System.out.println(tree.toString());
  System.out.println("++++++");
  tree.postoderDisplay();

  System.out.println(tree.getCount());
  System.out.println(tree.count(1));
  System.out.println("printing levels: ");
  tree.printLevels();

 }

 public static void main(String[]args){
   new Main();
 }
}