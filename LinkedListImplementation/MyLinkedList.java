package LinkedListImplementatioin;

import org.w3c.dom.NodeList;

public class MyLinkedList implements ItemList{

    ListItem Root;

    public  MyLinkedList(Node node){

        this.Root = node;
    }

    @Override
    public ListItem getRoot() {
        return this.Root;
    }

    @Override
    public boolean add(ListItem listItem) {

        if(this.Root==null){

            this.Root = listItem;
        }

        if(listItem!=null){

            ListItem cur = this.Root;

            while(cur!=null){

                int comparison = cur.compare(listItem);

                if(comparison<0){

                    if(cur.next()!=null){

                        cur = cur.next();
                    }
                    else{
                        cur.setNext(listItem).setPrev(cur);

                        return true;
                    }

                }

                else if(comparison>0){

                    if(cur.prev()==null){

                        cur.setPrev(listItem).setNext(cur);

                        this.Root = listItem;

                        return true;

                    }

                    else{
                        cur.prev().setNext(listItem).setPrev(cur.prev());

                        cur.setPrev(listItem).setNext(cur);

                    }

                    return true;

                }

                else {
                    System.out.println(" Duplicate Node contains.");

                    return false;
                }

            }

        }

            return false;
    }

    @Override
    public boolean remove(ListItem listItem) {

        ListItem cur = this.Root;

        if(listItem!=null){

            while(cur!=null){

                int comparison = this.Root.compare(listItem);

                if(comparison<0){

                    cur = cur.next();
                }
                else if(comparison ==0){

                    if(cur.prev()==null){

                        this.Root = cur.next();

                        cur.next().setPrev(null);

                        cur.setNext(null);

                        return true;

                    }

                   else{
                       cur.prev().setNext(cur.next());

                       if(cur.next()!=null){

                           cur.next().setPrev(cur.prev());
                       }

                       cur.setPrev(null);

                       cur.setNext(null);

                       return true;

                    }


                }

                else {
                    System.out.println(" No such a node in this list");

                    return false;
                }
            }

        }
                return false;

    }

    @Override
    public void traverse(ListItem listItem) {
        if(Root == null) {
            System.out.println("The list is empty");
        } else {
            while (Root != null) {
                System.out.println(Root.val);
                Root = Root.next();
            }
        }
    }
}
