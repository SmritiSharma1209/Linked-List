package Linked_list;

import java.util.Scanner;

public class Reverse_LL_iterative {
	
	
public static void main(String[] args) {
		
		Node<Integer> head=takeInput();
		Node<Integer> newHead= reverseIterative(head);
		print(newHead);
		
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


public static Node<Integer> reverseIterative(Node<Integer>head) {
	Node<Integer>curr=head;
	Node<Integer> prev=null;
	Node<Integer> temp;
	
	while(curr!=null) {
		temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
	}
	
	return prev;
}

}
