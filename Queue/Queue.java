package Queue;

public class Queue<T extends Comparable<T>> {
    int count;
    Node<T>firstNode;
    Node<T>lastNode;

    public boolean isEmpty(){

        return count==0;
    }

    public int size(){

        return this.count;
    }

    public void offer(Node<T>node){

        if(isEmpty()){

            firstNode = node;
            return;
        }
        count++;
        lastNode.setNextNode(node);
    }
    public  Node<T> poll(){

        if(isEmpty()){

            return null;
        }

        Node item = firstNode;

        if(firstNode.getNextNode()==null){

            lastNode = null;
        }
        firstNode = firstNode.getNextNode();

        return item;
    }













}
