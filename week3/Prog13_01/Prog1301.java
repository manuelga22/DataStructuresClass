package Prog13_01;

/**
 * Create a project with the code given. Write a Prog13_01 class to test it
 */

public class Prog1301{


 public static void main(String[]args){
   ListInterface list = new LinkedList();
   System.out.println("isEmpty?: "+list.isEmpty());
   list.add(13);
   System.out.println("isEmpty?: "+list.isEmpty());
   for(int a=1;a<10;a++){
     list.add(a);
   }

   list.display();
   

   


 }

}