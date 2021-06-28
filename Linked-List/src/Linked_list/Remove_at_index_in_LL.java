package Linked_list;

import java.util.Scanner;

public class Remove_at_index_in_LL {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	    Node<Integer>head= takeInput();
	    System.out.println("List before deletion");
	    print(head);
	    System.out.println("Enter idx you want to delete");
	    int idx= s.nextInt();
	    System.out.println("List after Deletion");
	    Node<Integer>newHead=delete_at_idx(idx,head);
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



    public static Node<Integer> delete_at_idx(int idx, Node<Integer>head) {
    	int count=1;
    	Node<Integer>temp=head;
    	Node<Integer>prev=null;
    	
    	if(idx==1) {
    		head=head.next;
    		return head;
    	}
    	
    	else {
    	while(count!=idx) {
    		prev=temp;
    		temp=temp.next;
    		count++;
    		 }
    	
    	prev.next=temp.next;
    	temp=prev.next;
    	}
    	return head;
    }

}
