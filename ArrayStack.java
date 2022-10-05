//created by Tarun Chandrasekaran TXC190022

//This class creates an array that can be ifempty, popped, pushed, and peeked

import java.util.EmptyStackException;

public class ArrayStack implements BKStack {

    double temp;

    //setting a large array size
    int arraySize = 234567898;

    //element count variable, counts pushes
    int count = 0;

    //array initialized to hold data
    public double arrayD[] =new double[arraySize];

    //checking if stack is empty by seeing if our count is less than 0
    @Override
    public boolean isEmpty() {
        return count < 0;
    }

    //pushing data into array. adds to the front, and increments a count variable initialized earlier
    @Override
    public void push(double dent) {
            arrayD[count] =dent;
            count++;
    }

    //class pop returns value and removes data
    @Override
    public double pop() {

        //check for empty stack first
        try{
            if(!isEmpty()) {
                temp = arrayD[count];
                count--;
            }
        } catch(EmptyStackException emp) {
            System.out.println("exception: empty stack");
        }
        
        return temp;
    }

    //peek shows count value
    @Override
    public double peek() {

        //variable to store array count
        double temp2 = 0;

        //check for empty stack first
        try{
            
            if (!isEmpty()) {
               temp2 = arrayD[count];
            }
        }catch(EmptyStackException emp) {
            System.out.println("exception: empty stack"); //throw exception
        }
        
        return temp2;
    }
}