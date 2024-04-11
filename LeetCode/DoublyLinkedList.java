package LeetCode;

public class DoublyLinkedList {

    private Node head,tail;
    private int size;

    DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    private class Node {
        int value;
        Node prev, next;

        Node(int data){
            this.value=data;
            this.prev=null;
            this.next=null;
        }
    }

    public void add(int data){
        Node node = new Node(data);

        if(head == null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.value + " ");  
            current = current.next;  
        }  
    }  
}
