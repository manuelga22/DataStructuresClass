
public class Prog17_01{

public Prog17_01(){
  System.out.println(" 4 factorial equals= "+ factorial(4));

}
/**
 * @param num any number
 * @return the factorial of the number 
 */
public int factorial(int num){
  if(num==1) return 1;
  else{
    return num*factorial(num-1);
  }
}


public static void main(String[]args){

  new Prog17_01();
}



}