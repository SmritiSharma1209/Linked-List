package Linked_list;

import java.util.Scanner;

public class addLast {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head=takeInput();
		System.out.println("LinkList before addition");
		print(head);
		System.out.println("Enter the value to be added to link List");
		int val=s.nextInt();
		addLast(val,head);
		System.out.println("LinkList after addition");
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

	
	
	public static Node<Integer> addLast(int val, Node<Integer>head){
		Node<Integer> newNode= new Node(val);
		Node<Integer>temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		temp=temp.next;
		
		return head;
		}
}
