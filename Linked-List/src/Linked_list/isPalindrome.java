package Linked_list;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Node<Integer>head= takeInput();
		System.out.println(IsPalindrome(head));
		

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

	public static boolean IsPalindrome(Node<Integer>head) {
		boolean pal=true;
		
		Node<Integer>slow=head;
		Node<Integer>fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node<Integer>head2=slow.next;
		slow.next=null;
		Node<Integer>reverseHead=reverse(head2);
	      
		Node<Integer> temp=head;
		Node<Integer>temp2=reverseHead;
		
		while(temp!=null && temp2!=null) {
		  if(temp.data!=temp2.data) {
			  pal=false;
			  break;
		 }
		  temp=temp.next;
		  temp2=temp2.next;
		}
		return pal;
		
	    
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





