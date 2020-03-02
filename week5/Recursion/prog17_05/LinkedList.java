package prog17_05;
public class LinkedList implements ListInterface {

    public class Node {

        private int info;   
        private Node next;  

        public Node() {
            info = 0;
            next = null;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public int getInfo() {
            return info;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node first;

    public LinkedList() {
        first = new Node();
    }

    /**
     * returns the amount of nodes in a linked list
     */
    public int countNodes(){

      return count(first.getNext());        
    }
    private int count(Node node){
      if(node == null) return 0;
      else  return 1+count(node.getNext());
    }



    
    public boolean isEmpty() {
        return (first.getNext() == null);
    }
    public int length(){
       int length = 0;
       Node current = first;
       while(current != null){
         length++;
         current = current.getNext();
       }
       return length;
    }

    public void display() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo() == x) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void add(int x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    public void remove(int x) {
        Node old = first.getNext(),
                p = first;

        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo() == x) {
                found = true;
            }
            else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    public void insert(int x, int loc) {
        if(loc >= length() ){

          System.out.println("location not found");

        }else{

        Node node = new Node();
        node.setInfo(x);
       
        int counter = 1;
        Node current = first;

        while(current.next != null){
           if(counter == loc){
             node.next = current.getNext();
             current.next = node;
           }
           
           current = current.getNext();
           counter++;
        }
       }

    }

    public void removeItemAt(int loc) {
        if(loc >= length()){
            System.out.println("location not found");
        }else{

        Node current = first ; 
        int counter=1;

        while(current.next != null){
            if(loc ==counter){
             current.setNext(current.getNext().getNext());
            }
            current =current.getNext();
            counter++;
        }
      }
         
    }
}
