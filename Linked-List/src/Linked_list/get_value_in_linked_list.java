package Linked_list;

import java.util.Scanner;

public class get_value_in_linked_list {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
	Node<Integer>head= takeInput();
	print(head);
	System.out.println("Enter Position");
	int pos= s.nextInt();
	int value=getValue(pos,head);
	System.out.println(value);

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


   public static int sizeOfLinkedList(Node<Integer>head) {
	   int sizeOfLL=0;
	   Node<Integer> temp=head;
		  while(temp!=null) {
			  temp=temp.next;
			  sizeOfLL++;
		  }
		  return sizeOfLL;
   }
	
	
	public static int getValue(int pos, Node<Integer>head) {
	   int count=1;
	   if(head==null) {
		   System.out.println("List is Empty");
		   return -1;
	   }
	   
	   int size=sizeOfLinkedList(head);
	   if(pos>size) {
		  System.out.println("Invalid position");
		  return -1;
	  }
	   
	   Node<Integer>temp=head;
	   while(count!=pos) {
		   temp=temp.next;
		   count++;
	   }
	   return temp.data;
	 }



}
