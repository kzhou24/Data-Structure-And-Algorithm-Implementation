package Stack;

public class Stack <T extends Comparable<T>>{

    private T[] stack;
    private int count;

    public Stack(){

       stack = (T[]) new Object[count];
    }

    // Add the new item to the end of the array

    public void push(T data){

        if(count == stack.length){

            resize(2*stack.length);
        }

        stack[count++] = data;


    }

    public T pop(){

        if(isEmpty()){

            return null;
        }
        T item = stack[--count];
        stack[count] = null;

        return item;
    }

    public int size(){

        return count;
    }

    public boolean isEmpty(){

        return count ==0;

    }
    public void resize(int n ){

        T[]stackCopy = (T[])new Object[n];

        for(int i = 0;i<stack.length;i++){
            stackCopy[i] = stack[i];
        }
        stack = stackCopy;


    }










//    private int count;
//    private Node<T>head;
//
//    public boolean isEmpty(){
//
//        return count==0;
//    }
//    public int size(){
//
//        return this.count;
//    }
//
//    public T pop(){
//
//        T item = head.getData();
//        head = head.getNextNode();
//        count--;
//        return item;
//    }
//
//    public void push(T data){
//        count++;
//        Node<T>newNode = new Node(data);
//
//        if(head==null){
//            head = newNode;
//        }
//        else{
//
//            newNode.setNextNode(head);
//             head = newNode;
//        }
//
//
//    }
//


}
