import java.util.Arrays;

/**
 * The class ArrayBag implements an array-based bag.
 *
 * @author (add here your Panther ID)
 */
public class ArrayBag
{
    /**
     * Default constructor. Initial bag capacity is 1.
     *
     */
    public ArrayBag()
    {  
        SIZE=1;
        bag = new String[SIZE];
        length = 0;
    }

    /**
     * Adds new element to the bag. If the array used to store the bag items is
     * full, it will be expanded by doubling its size.
     *
     * @param s new element to be added to the bag.
     */
    public void add(String s)
    {  
        // System.out.println("bag.length "+bag.length);
        if(length == SIZE){
            SIZE = SIZE*2;
            bag = Arrays.copyOf(bag, SIZE);
            // System.out.println("length "+length +" SIZE: "+SIZE);
            
        }

        bag[length] = s;
        length++;
        

    }

    /**
     * Determines the number of occurrences in the bag of a given element.
     *
     * @param s given element
     * @return number of times the given element occurs in the bag.
     */
    public int count(String s)
    {  
        int counter = 0;
        for(int a = 0; a < length ; a++){
           if(bag[a].equals(s)) counter++;
        }
        return counter;
    }

    /**
     * Determines if bag is empty.
     *
     * @return true if bag contain no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        
        if(length == 0){
            return true;
        }
        return false;
    }

    /**
     * Removes all occurrences of a given element.
     *
     * @param s element to be removed.
     */
    public void remove(String s)
    {
        for(int a = length-1; a>=0 ; a--){// loop to check for all the ocurrences of the element

           if(bag[a].equals(s) ){
                if(length==1){//if there is only one element to delete then restart the bag again
                    bag = new String[SIZE];
                    length = 0;
                }else{
                  bag[a] = bag[length-1];// replace th e value being removed by a different one
                  System.arraycopy(bag,0,bag,0,length-1);   
                  length--; // length-1 because we just removed one element
                }
                // bag[a] = bag[length-1];// replace th e value being removed by a different one
                // bag = Arrays.copyOfRange(bag,0, length-1);// copy the bag without the last value which is extra
                // bag = Arrays.copyOf(bag, SIZE); //restore the bag's original size
                // length--;
           }

        }
    }

    /**
     * Constructs a String description of the bag.
     *
     * @return String containing the bag elements.
     */
    public String toString()
    {
        String str = "";

        for (int i=0; i<length-1; i++)
        {
            str += bag[i] + ", ";
        }

        if (length != 0) return "Bag: {" + str + bag[length-1] + "}";
        else return "Bag: {" + str + "}";
    }

    private String[] bag;   //array that stores the bag elements
    private int length;     //number of elements in the bag
    private int SIZE;       //bag capacity
}


 // if(a == length-1 && length>1){
                 
                //   bag = Arrays.copyOf(bag, length-2);
                //   length--;

                // }else if (length>1) {
                //     System.out.println("removing ");
                //     for(int index = a; index < length-1; index++){                
                //         bag[index] = bag[index+1]; // decrease the position of all the elements in fron of the one being removed      
                //     }     
                //     length--;  
            

                // }else{// if array only contains one element, then restart it
                //     bag = new String[SIZE];
                //     length = 0;
                // }