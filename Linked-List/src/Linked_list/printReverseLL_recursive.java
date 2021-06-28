package Linked_list;

import java.util.Scanner;

public class printReverseLL_recursive {

	public static void main(String[] args) {
		Node<Integer>head=takeInput();
		printRecursive(head);

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
	
	
	public static void printRecursive(Node<Integer> head) {
		if(head==null) {
			return;
		}
		printRecursive(head.next);
		System.out.print(head.data + "->");
	}

}



