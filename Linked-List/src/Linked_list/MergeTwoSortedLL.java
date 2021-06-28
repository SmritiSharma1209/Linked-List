package Linked_list;

import java.util.Scanner;

public class MergeTwoSortedLL {

	public static void main(String[] args) {

         Node<Integer> head1= takeInput();
         Node<Integer> head2= takeInput();
         Node<Integer>mergedHead= mergeLL(head1, head2);
         System.out.println("Merged LinkedList is");
         print(mergedHead);

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

    public static Node<Integer> mergeLL(Node<Integer>head1, Node<Integer>head2){
    	Node<Integer>newHead=null;
    	Node<Integer>newTemp=null;
    	Node<Integer>temp1=head1;
    	Node<Integer>temp2=head2;
    	
    	
    	
    	if(newHead==null) {
    	     if(head1.data<head2.data) {
    		         newHead=head1;
    		         temp1=temp1.next;
    		         newTemp=newHead;
    	       }
    	     else {
    		         newHead=head2;
    		         temp2=temp2.next;
    		         newTemp=newHead;
    		         
    	       }
    	}
    	
    	while(temp1!=null && temp2!=null) {
    		if(temp1.data<temp2.data) {
    			newTemp.next=temp1;
    			newTemp=newTemp.next;
    			temp1=temp1.next;
    		}
    		else {
    			newTemp.next=temp2;
    			newTemp=newTemp.next;
    			temp2=temp2.next;
    		}
    	}
    	
    	while(temp1!=null) {
    		newTemp.next=temp1;
    		newTemp=newTemp.next;
    		temp1=temp1.next;
    	}
    	
    	while(temp2!=null) {
    		newTemp.next=temp2;
    		newTemp=newTemp.next;
    		temp2=temp2.next;
    	}
    		return newHead;
    	}
    	
    	
}
