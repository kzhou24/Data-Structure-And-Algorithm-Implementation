package BinarySearch;

public class Node<T>{

    private T data;
    private Node<T>leftChild;
    private Node<T>rightNode;
    private Node<T>parentNode;



    public Node(T data,  Node<T> parentNode) {
        this.data = data;
        this.parentNode = parentNode;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "data=" + data ;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
