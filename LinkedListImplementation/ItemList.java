package LinkedListImplementatioin;

public interface ItemList {
    ListItem getRoot();
    boolean add(ListItem listItem);
    boolean remove(ListItem listItem);
    void traverse(ListItem listItem);


}
