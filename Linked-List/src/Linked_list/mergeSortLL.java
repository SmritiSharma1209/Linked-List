package Linked_list;

import java.util.Scanner;

public class mergeSortLL {

	public static void main(String[] args) {
		Node<Integer>head=takeInput();
		Node<Integer>newhead=mergeSort(head);
		print(newhead);
		
		
	}
	
	public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer>head2){
		
		Node<Integer> newHead=null;
		Node<Integer>newtemp=null;
		Node<Integer>temp1=head1;
		Node<Integer>temp2=head2;
		
		if(newHead==null) {
			if(head1.data<head2.data) {
				newHead=head1;
				temp1=temp1.next;
				newtemp=newHead;
			}
			else {
				newHead=head2;
				temp2=temp2.next;
				newtemp=newHead;
			}
		}
		
		while(temp1!=null && temp2!=null) {
			if(temp1.data<temp2.data) {
				newtemp.next=temp1;
				newtemp=newtemp.next;
				temp1=temp1.next;
			}
			else {
				newtemp.next=temp2;
				newtemp=newtemp.next;
				temp2=temp2.next;
			}
		}
		
		while(temp1!=null) {
			newtemp.next=temp1;
			newtemp=newtemp.next;
			temp1=temp1.next;
		}
		
		while(temp2!=null) {
			newtemp.next=temp2;
			newtemp=newtemp.next;
			temp2=temp2.next;
		}
		
		return newHead;
	}
	
	public static Node<Integer> mergeSort(Node<Integer>head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer>middle= mid(head);
		Node<Integer> middle_next=middle.next;
		middle.next=null;
		Node<Integer> left= mergeSort(head);
		Node<Integer>right=mergeSort(middle_next);
		Node<Integer> newHead= mergeTwoSortedLL(left, right);
		return newHead;
		
	}
	
	public static Node<Integer> mid(Node<Integer>head){
		Node<Integer>slow=head;
		Node<Integer>fast=head;
		
		int size=0;
		Node<Integer>temp=head;
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
		
		if(size%2==0) {                                 //if size is even
			while(fast.next.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
		}
		else {                                              //id size is odd
			while(fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
		}
		return slow;
		
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
