package LinkedList;

import java.sql.SQLOutput;

class Node<T>{
    T value;
    Node<T> next;
    public Node(T value){
        this.value = value;
        this.next = null;
    }
}

class LinkedList<T>{
    Node<T> head;
    Node<T> tail;
    static int size;
    public LinkedList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void printList(){
        if(size == 0){
            System.out.println("The List is Empty");
        }else{
            Node<T> cur = head;
            while(cur!=null){
                System.out.print(cur.value + " --> ");
                cur = cur.next;
            }
            System.out.print("null");
        }
    }

    public void addFirst(T value){
        Node<T> newNode = new Node<T>(value);
        if(size == 0){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(T value){
        Node<T> newNode = new Node<T>(value);
        if(size == 0){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void deletionAtStart(){

    }

    public void addAtPosition(T value, int pos){

        if(size<pos){
            System.out.println("Invalid Position");
        }else{

            if(pos == 0){
                addFirst(value);
            }
            if(pos == size-1){
                addLast(value);
            }else{
                Node<T> newNode = new Node<T>(value);
                Node<T> curr = head;
                int i = 0;
                while(i != pos - 1 && curr.next != null){
                    curr= curr.next;
                    i++;
                }
                newNode.next = curr.next;
                curr.next = newNode;
            }
            size++;
        }

    }


}

public class CustomLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(50);
        ll.addLast(90);
        ll.addLast(80);
        ll.addAtPosition(40, 3);
        ll.printList();
    }
}