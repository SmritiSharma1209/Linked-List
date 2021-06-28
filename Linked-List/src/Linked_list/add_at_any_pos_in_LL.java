package Linked_list;

import java.util.Scanner;

public class add_at_any_pos_in_LL {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node<Integer> head= takeInput();
		System.out.println("Before adding value");
		print(head);
		System.out.println("Enter the index");
		int idx=s.nextInt();
		System.out.println("Enter value");
		int val=s.nextInt();
		Node<Integer>newHead= addAt(idx,val,head);
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


     public static Node<Integer> addAt(int idx, int val , Node<Integer> head){
    	 int count=1;
    	 
    	 Node<Integer> newNode= new Node(val);
    	 Node<Integer>temp=head;
    	 
    	 if(idx==1) {
    		 newNode.next=head;
    		 head=newNode;
    		 return head;
    		 
    	 }
    	 
    	 while(count!=idx-1) {
    		 temp=temp.next;
    		 count++;
    	}
    	 newNode.next=temp.next;
    	 temp.next=newNode;
    	 return head;
    	 
    }


}
