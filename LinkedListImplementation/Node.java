package LinkedListImplementatioin;

public class Node extends ListItem{

    public Node(int val) {
        super(val);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.rightLink = listItem;

        return this.rightLink;
    }

    @Override
    ListItem setPrev(ListItem listItem) {
        this.leftLink = listItem;
        return this.leftLink;
    }

    @Override
    ListItem prev() {
        return this.leftLink;
    }


    @Override
    int compare(ListItem listItem) {

      if(listItem!=null){

          if(this.val<listItem.val){
              return -1;
          }
          else if(this.val> listItem.val){

              return 1;
          }

          else{

              return 0;
          }
      }

      return -1;
    }
}
