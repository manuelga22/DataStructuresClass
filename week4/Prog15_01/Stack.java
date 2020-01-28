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
        list[top] = c;
        top++;
    }

    public void pop()
    {
        top--;
    }

    public char peek()
    {
        return list[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }
    private char[] list;
    private int size;
    private int top;
}