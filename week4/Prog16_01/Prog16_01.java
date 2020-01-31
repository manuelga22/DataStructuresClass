
public class Prog16_01
{

    public static void main(String[] args)
    {
        Queue q = new Queue();

        //Insertion
        for (int i = 0; i < 10; i++)
        {
            int x = 32 + (int) (Math.random() * 95);
            System.out.println(x + " --> " + (char) x);
            q.enqueue((char) x);
        }

        //Display and removal
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Item at the front: " + q.getFront());

            q.dequeue();
        }
    }
}
