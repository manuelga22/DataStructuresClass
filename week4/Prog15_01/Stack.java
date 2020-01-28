import java.util.*;
public class Stack
{
    public Stack()
    {
        size = 100;
        list = new char[size];
        top = 0;
    }
    public Stack(int s)
    {
        size = s;
        list = new char[size];
        top = 0;
    }
    public void push(char c)
    {
        if(isFull()){
          size= size*2;
          list = Arrays.copyOf(list, size*2);  
        }
        list[top]=c;
        top++;
    }
    public void pop()
    {
        if(!isEmpty())top--;
        else System.out.println("Stack is empty");
    }

    public char peek()
    {
        if(!isEmpty()) return list[top - 1];
        else{
            System.out.println("stack is empty");
            return ' ';
        }   
    }

    public boolean isEmpty()
    {
        return top == 0;
    }
    private char[] list;
    private int size;
    private int top;
}