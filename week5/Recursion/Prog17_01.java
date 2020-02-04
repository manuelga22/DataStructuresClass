
public class Prog17_01{

public Prog17_01(){
  System.out.println(" 4 factorial equals= "+ factorial(125));
  System.out.println(" recurrense of 4 = "+recurrense(4) );

  System.out.println(" fibonacci number of 8= "+fibonacci(8));
  System.out.println(" fibonacci number of 21= "+fibonacci(21));


  int [] arr = {2,6,7,8};
  printBackwards(arr, arr.length);
}
/**
 * @param num any number
 * @return the factorial of the number 
 */
long factorial(int num){
  if(num==1) return 1;
  else{
    return num*factorial(num-1);
  }
}
/**
 * @param num any number
 * @return returns the recurrense of that number
 */
public double recurrense(double num){
  if(num<0){
     return -1;
  }
  if (num ==0){
    return 5;
  }else{
    return (2*recurrense(num-1))+3;
  }
}

/**
 * @param num any number
 * @return the fibonacci number of the entered number
 */
public double fibonacci(double num){
  if(num == 0){
    return 0;
  }else if(num==1){
    return 1;
  }else{
    return fibonacci(num-1) + fibonacci(num-2);
  }

}
/**
 * method that prints an array backwards
 */
public void printBackwards(int []arr, int length){
  
  if(length == 1){
    System.out.println(arr[0]+ " DONE PRINTING");
  }else if( length > 1){

   System.out.println(" "+ arr[length-1]+ " ");
   printBackwards(arr, length -1);
  }
   
}

public static void main(String[]args){

  new Prog17_01();
}



}