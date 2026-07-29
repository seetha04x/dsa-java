import java.util.Stack;

import Arrays.palindrom;

public class linkedpalin {

    class Node{
        char data;
        Node next;

        Node(char data){
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    void addLast(char data){
        Node newnode=new Node(data);

        if(head==null){
             head=newnode;
             return;}
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void printList(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null) System.out.print("->");
        }
        System.out.println();

    }

    boolean palindrome(){
        Stack<Character> stack=new Stack<>();

        Node temp=head;
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    
        while(temp!=null && temp!=slow){
            stack.push(temp.data);
            temp=temp.next;
        }
        System.out.println("slow: "+slow.data);
        System.out.println("temp: "+temp.data);
        
        if(fast!=null) {
            stack.push(slow.data);
            System.out.println("Evenskipped: "+temp.data);
            temp=temp.next;}
        else {
            temp=temp.next;
            System.out.println("skipped: "+temp.data);}

        // while(!stack.isEmpty()){
        //     System.out.println(stack.pop());
        // }
        while(!stack.isEmpty()&&temp!=null ){
            if(stack.peek()==temp.data) stack.pop();
            else return false;
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        linkedpalin p1=new linkedpalin();

        p1.addLast('a');
        p1.addLast('b');
        p1.addLast('b');
        p1.addLast('a');
        p1.addLast('a');
        
        p1.printList();
        if(p1.palindrome()) System.out.println("Yes");
        else System.out.println("No");


    }
}
