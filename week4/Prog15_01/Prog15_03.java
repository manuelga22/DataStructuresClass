public class Prog15_03{
  public Prog15_03(Stack list){
    
    printStack(list);
  }
  public void printStack(Stack list){
    //copying list into temp
    while(!list.isEmpty()){
     temp.push(list.peek());
     list.pop();
    }

    //printing temp and inserting items back to list
    while(!temp.isEmpty()){
      System.out.println(temp.peek()+" ");
      list.push(temp.peek());
      temp.pop();
    }
    System.out.println();

  }

  public static void main(String[]args){
   Stack list = new Stack(5);
   list.push(f);
   list.push(s);

    new Prog15_03(list);
  }


}

