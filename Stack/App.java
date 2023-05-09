package Stack;

public class App {

    public static void main(String[] args) {

        Stack<String>names = new Stack<String>();

        names.push("Adam");
        names.push("Anna");
        names.push("Jackson");
        names.push("Ke");
        names.push("Ken");
        names.push("Shen");

        System.out.println(names.pop());

        while(!names.isEmpty()){

            System.out.println(names.pop());
        }


    }




}
