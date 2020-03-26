
public class Heap
{

    public Heap()
    {
        length = 0;
        arraySize = 50;
        list = new int[arraySize];
    }

    public void add(int x)
    {
        int loc = ++length;

        list[0] = x;
        while (x < list[loc / 2])
        {
            list[loc] = list[loc / 2];
            loc /= 2;
        }

        list[loc] = x;
    }
  
    public void removeMin()
    {
        int lastItem = list[length];
        length--;

        int parent = 1;
        while (parent * 2 <= length)
        {
            int child = parent * 2;

            if (child != length && list[child + 1] < list[child])
                child++;

            if (list[child] < lastItem)
                list[parent] = list[child];
            else
                break;

            parent = child;
        }

        list[parent] = lastItem;
    }

    public int min()
    {
        return list[1];
    }

    private int list[]; //store the heap elements
    int arraySize;      //size of the array
    int length;         //current number of elements in the array
}
