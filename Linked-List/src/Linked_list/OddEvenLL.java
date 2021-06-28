package Linked_list;

import java.util.Scanner;

public class OddEvenLL {

	public static void main(String[] args) {
		Node<Integer>head=takeInput();
		Node<Integer> newHead=OddEven(head);
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


  public static Node<Integer> OddEven(Node<Integer>head){
	  
	  Node<Integer>temp=head;
	  Node<Integer>evenHead=null;
	  Node<Integer>oddHead=null;
	  Node<Integer>eventail=null;
	  Node<Integer>oddtail=null;
	  
	  if(head==null || head.next==null) {
		  return head;
	  }
	  else {
		  
		  while(temp!=null) {
		  
			  if(temp.data%2==0) {
			   if(evenHead==null) {
				  evenHead=temp;
				  eventail=evenHead;
				 }else {
				  eventail.next=temp;
				  eventail=eventail.next;
				  }
			  }
		 
			  else {
			   if(oddHead==null) {
				  oddHead=temp;
				  oddtail=oddHead;
			  }else {
				  oddtail.next=temp;
				  oddtail=oddtail.next;
			  }
			}
			  temp=temp.next;
		}
		  
		  oddtail.next=evenHead;
	  }
	  
	  return oddHead;
	  
  }
}
