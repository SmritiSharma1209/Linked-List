package Linked_list;

import java.util.Scanner;

public class Remove_Last_In_LL {

	public static void main(String[] args) {
		Node<Integer>head= takeInput();
		System.out.println("Before deletion");
		print(head);
		System.out.println("After deletion");
		removeLast(head);
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


    public static void removeLast(Node<Integer> head) {
    	Node<Integer> temp=head;
    	
    	while(temp.next.next!=null) {
    		temp=temp.next;
    		
    	}
    	temp.next=null;
    	
    }

}
