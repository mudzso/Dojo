package com.company;

/**
 * Created by Marci on 2017.07.04..
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public boolean hasLoop(){
        Node slow;
        Node fast;
        slow = fast = this;

        while (true){
            slow = slow.next;
            if(fast.next !=null){
                fast = fast.next.next;
            }else{
                return false;
            }
            if (slow == null || fast == null){
                return false;
            }
            if (slow == fast){
                return true;
            }

        }

    }

    public void listNodes(){
        System.out.println(this.data);
        if (this.next !=null ){
            this.next.listNodes();
        }
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
