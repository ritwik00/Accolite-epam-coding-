package LeetCode;

public class LinkList {
    private Node head;
    private Node tail;
    private int size;

    LinkList(){
        this.size=0;
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

        Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }


    public void addFirst(int data){
        Node node = new Node(data);

        if(head != null){
            node.next=head;
            head=node;
        }
    }
    public void display()
    {
        System.out.println();
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
    public void add(int data) {
        Node node = new Node(data);

        if(head == null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }

}
