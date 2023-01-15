package Week1;

import java.util.ArrayList;
import java.util.Random;

public class Bag<T>{  // Java Generic, T -> any primitive type
ArrayList<T>list;
Random r;
// Initialize Random class to generate random index (binary search works either)
public Bag(){
    this. r = new Random();
    this.list = new ArrayList<>();
}
public void add(T item){
    list.add(item);
}
public void clear(){
    this.list.clear();
}
public boolean contains(T item){

    if(list.contains(item)){
        System.out.println("Duplicate item contained");
        return true;
    }
    System.out.println(" No item found");
    return false;
}
public T grab(){
    int index = r.nextInt(0,list.size()); // Generate random index
    return list.get(index);
}

public boolean isEmpty(){

   return list.isEmpty();
}

public boolean remove(T item){
    if(!contains(item)){
        System.out.println("No item found");
        return false;
    }

    list.remove(item);
    System.out.println(" Item removed");
    return true;
}

public int size(){
    return this.list.size();
}

public T[] toArray(){

    return (T[]) this.list.toArray(); // cast and generate new array
}

public String toString(){

    return ""+list;

}

}
