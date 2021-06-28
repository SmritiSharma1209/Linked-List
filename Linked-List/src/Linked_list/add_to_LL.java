package Linked_list;

import java.util.Scanner;

public class add_to_LL {

	public static void main(String[] args) {
		Node<Integer> head1= takeInput();
		Node<Integer>head2 = takeInput();
		add(head1, head2);
		print(head1);
		
		
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


     public static void add(Node<Integer>head1, Node<Integer>head2){
    	 Node<Integer>temp1= head1;
    	 Node<Integer>temp2= head2;
    	 
    	while(temp1!=null && temp2!=null) {
    		temp1.data=temp1.data+temp2.data;
    		temp1=temp1.next;
    		temp2=temp2.next;
    	}
    	while(temp2!=null) {
    		temp1.next=temp2;
    	}
    	 
    	 
     }

}
