package Linked_list;

import java.util.Scanner;

public class remove_duplicates {

	public static void main(String[] args) {
	Node<Integer> head=takeInput();
	Node<Integer>newHead=removeDuplicates(head);
	print(newHead);
	

	}

	public static Node<Integer> removeDuplicates(Node<Integer>head) {
		Node<Integer>temp=head;
		while(temp!=null && temp.next!=null) {
			
			if(temp.data.equals(temp.next.data)) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
		return head;
		
		
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

}
