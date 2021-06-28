package Linked_list;

import java.util.Scanner;

public class Kth_nodefromLast {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter LinkList");
	    Node<Integer>head= takeInput();
		System.out.println("Before Deletion");
		print(head);
		System.out.println("Enter Value of K");
		int k= s.nextInt();
		int val= kthFromLast(k, head);
		System.out.println(val);
		
		
		

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

	public  static int kthFromLast(int k, Node<Integer>head){
		
	      int size=0;
	      Node<Integer>temp=head;
	      while(temp!=null) {
	    	  size++;
	    	  temp=temp.next;
	      }
	      
	      int count=0;
	      
	      Node<Integer> val=head;
	      while(count!=size-k-1) {
	    	  val=val.next;
	    	  count++;
	      }
	      return val.data;
	      }
}
