package LinkedListImplementatioin;

public abstract class ListItem {

    ListItem rightLink = null;
    ListItem leftLink = null;
    int val;
    public ListItem(int val){

        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val){

        this.val = val;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem prev();
    abstract ListItem setPrev(ListItem listItem);
    abstract int compare(ListItem listItem);

}
