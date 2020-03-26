package Binarytrees;
/**
 * @author A. Hernandez Data Structures and Algorithms
 */
public class BinarySearchTree
{
    public class Queue{
        public Queue()
        {
            size = 100;
            list = new Node[size];
    
            front = 0;
            back = size - 1;
    
            count = 0;
        }
    
        public Queue(int s)
        {
            size = s;
            list = new Node[size];
    
            front = 0;
            back = size - 1;
    
            count = 0;
        }
    
        public void enqueue(Node c)
        {   if(count < size){
              back = (back + 1) % size;
              list[back] = c; 
              count++;
            }else{
                System.out.println("Queue is full");
            }
        }
    
        public void dequeue()
        {
            if(!isEmpty()){
                front = (front + 1) % size;
                count--;
            }else System.out.println("Queue is empty");
            
        }
    
        public Node getFront()
        {   if(count >= 0){
              return list[front];
            }else{
                System.out.println("list is empy");
            }
            return root;
        }
      
        public void printQueue(){
           
           for(int i = 0;i<count;i++){
            System.out.println(list[(front+1)%size]);
           }
        }
    
        public void clear(){
            front =0;
            back= size-1;
            count =0;
        }
    
        public boolean isEmpty()
        {
            return count == 0;
        }
    
        private Node[] list;
        private int size;
        private int count;
        private int front, back;
    }
    
    public BinarySearchTree()
    {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void display()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }
    public void printLevels(){
        Queue q = new  Queue();

        if(root.getLeftChild() != null){
            q.enqueue(root.getLeftChild());
            while(!q.isEmpty()){
                Node p = q.getFront();
                q.dequeue();

                System.out.print(p.getInfo()+" ");
                if(p.getLeftChild() != null){
                    q.enqueue(p.getLeftChild());

                }
                if(p.getRightChild() != null){
                    q.enqueue(p.getRightChild());
                }
            }
            System.out.println();
        }
    }
    public boolean contains(int x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(int x)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
    }

    public int getMin()
    {
        return getMin(root);
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    public void preorderDisplay(){
        preorderDisplay(root.getLeftChild());
        System.out.println();
    }
    private void preorderDisplay(Node p){
        if(p!= null){
            System.out.println(p.getInfo()+ " ");
            postorderDisplay(p.getLeftChild());
            postorderDisplay(p.getRightChild());
        }
    }
    public void postoderDisplay(){
        postorderDisplay(root.getLeftChild());
        System.out.println();
    }
    private void postorderDisplay(Node p){
        if(p!= null){
            postorderDisplay(p.getLeftChild());
            postorderDisplay(p.getRightChild());
            System.out.println(p.getInfo()+ " ");

        }
    }

    private boolean search(int x, Node p)
    {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    public int getHeight(){
        return getHeight(root);
    }
    private int getHeight(Node p){
        if(p==null){
            return -1;
        }else{
            return 1+ Math.max(getHeight(p.getLeftChild()), getHeight(p.getRightChild()));
        }
    }
    public int getCount(){
        return getCount(root.getLeftChild());
    }
    private int getCount(Node p){
         if(p==null){
             return 0;
         }else{
           return 1+getCount(p.getLeftChild())+getCount(p.getRightChild());
         }
    }

    public int count(int num){
        return count(root.getLeftChild(),num);
    }
    private int count(Node p , int num){
        if(p==null){
            return 0;
        }else if(p.getInfo() < num){
           return count(p.getLeftChild(),num);
        }else if (p.getInfo() > num){
            return count(p.getLeftChild(),num);
        }else{
            return 1+count(p.getRightChild(), num);
        }
    }

    private void insert(int x, Node p)
    {
        if (x < p.getInfo())
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else
                insert(x, p.getLeftChild());
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else
            insert(x, p.getRightChild());
    }

    private int getMin(Node p)
    {
        if (p.getLeftChild() == null)
            return p.getInfo();
        else
            return getMin(p.getLeftChild());
    }
    public String toString() {
       return toString(root.getLeftChild());
    }
    public String toString(Node p){
        if(p != null){
            return toString(p.getLeftChild())+ p.getInfo()+ " "+ toString(p.getRightChild());
        }else return " ";
    }
}
