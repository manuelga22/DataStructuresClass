public class Prog15_01
{
    
    public static void main(String[] args)
    {
        Stack s = new Stack();

        //insertion
        for (int i = 0; i < 10; i++)
        {
            int x = 32 + (int) (Math.random() * 95);
            System.out.println(x + " --> " + (char) x);
            s.push((char) x);
        }

        //removal and display
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Item at the top: " + s.peek());

            s.pop();
        }
    }
}