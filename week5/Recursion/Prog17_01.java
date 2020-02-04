
public class Prog17_01{

public Prog17_01(){
  System.out.println(" 4 factorial equals= "+ factorial(125));

  System.out.println(" recurrense of 4 = "+recurrense(4) );
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
 * 
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


public static void main(String[]args){

  new Prog17_01();
}



}