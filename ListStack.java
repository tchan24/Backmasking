//created by Tarun Chandrasekaran TXC190022
import java.util.EmptyStackException;

//List stack implements BKStack. uses backmasking.java to push data into a stack

public class ListStack implements BKStack {
    //create template for nodes in linked list
    public class Node{
        public double Num;
        public Node nNode = null;
    }

    //defining head node so all classes can access and where data is entered
    Node hNode = null;


    @Override
    //class to check if node is empty
    public boolean isEmpty(){
        return hNode == null;
    }


    //class push to input into head node
    @Override
    public void push(double dent){
        //new node creation to insert
        Node inNode = new Node();
        inNode.Num = dent;

        //if head node is empty insert there
        if (isEmpty()) {
            hNode = inNode;
        }
        else{
            //add node if not empty as head node
            inNode.nNode = hNode;
            hNode = inNode;
        }
    }

    //class pop to remove node and return
    @Override
    public double pop(){
        
        //variable to store value gets initialized
        double number = 0.0;
        
        //check if empty then proceed
        try{
            //move data if not empty
            if (!isEmpty()) {
                number = hNode.Num;
                hNode = hNode.nNode;
            }
        } catch(EmptyStackException emp){
            System.out.println("exception: empty stack");
        }
        //return value
        return number;
    }

    @Override
    public double peek() {
        //check if empty
        try{
            if (!isEmpty()) {
                //not empty then return
               return hNode.Num;
            }
        } catch(EmptyStackException emp){
            System.out.println("exception: empty stack");
        }
        return hNode.Num;
    }
}