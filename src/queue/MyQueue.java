package queue;
import node.*;

import node.Node;

public class MyQueue {
    Node front;  //head
    Node rear;      //tail
    int size;
    public MyQueue(){
        rear=null;
        front=null;
        size=0;
    }

    //insert operation in queue
    public void enqueue(int element){
        Node node=new Node(element);
        if(isEmpty()){
            front=node;
            rear=node;
            size++;
        }
        else{
            //add node at the end of queue and update rear pointer
            rear.setNext(node);
            rear=node;
            size++;
        }

    }


    //delete operation from queue
    public int dequeue(){
        int response=0;
        if(front==null){
            System.out.print("queue is empty");

        }
        else{
            //update front pointer
            response=front.getData();
            front=front.getNext();
            size--;
        }
        return response;
    }






    public int peek() {
        int response = 0;
        if (front == null) {
            System.out.print("queue is empty");
        } else {
            response=front.getData();
        }
        return response;
    }




    public boolean isEmpty(){
        boolean response=false;
        if(size==0){
            response=true;
        }
        return response;
    }


    public int getSize(){
        return size;
    }

}
