package Linked_list;

import java.util.Scanner;

public class addFirstInLL {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node<Integer>head= takeInput();
		System.out.println("LinkList  before addition of value");
		print(head);
		System.out.println("Enter the value");
		int val= s.nextInt();
		Node<Integer>newHead=addValue(val, head);
		System.out.println("List after additon");
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


    public static Node<Integer> addValue(int val , Node<Integer>head){
    	
    	Node<Integer>newNode= new Node(val);
    	newNode.next=head;
    	head=newNode;
    	return head;
    }


}
