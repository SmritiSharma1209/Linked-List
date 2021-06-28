package Linked_list;

import java.util.Scanner;

public class Fold_a_LL {

	public static void main(String[] args) {
		Node<Integer>head= takeInput();
		fold(head);
		print(head);

	}
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer>tail=null;
		
		while(data!=-1) {
			Node<Integer> newNode= new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				Node<Integer>temp= head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
				temp=temp.next;
				tail=temp;
				
			}
			
			
			data=s.nextInt();
		
		}
		
		return head;
		
	}
	
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println();
	

}

    public static void fold(Node<Integer>head) {
    	Node<Integer> slow= head;
    	Node<Integer> fast=head;
    	
    	while(fast.next!=null && fast.next.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	
    	Node<Integer>head1=slow.next;
    	slow.next=null;
    	Node<Integer> revHead = reverse(head1);
    	
    	
    	Node<Integer>temp=head;
    	Node<Integer>revtemp=revHead;
    	Node<Integer>curr=null;
    	
    	while(temp!=null || revtemp!=null) {
    		Node<Integer>temp_next=temp.next;
    		temp.next=revtemp;
            revtemp=revtemp.next;
            temp=temp.next;
            temp.next=temp_next;
    		temp=temp.next;   		
    	}
    }
    
    
    public static Node<Integer> reverse(Node<Integer>head){
		Node<Integer> curr=head;
		Node<Integer> prev= null;
		Node<Integer>forward =null;
		
		while(curr!=null) {
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		return prev;
	}
	  
}
