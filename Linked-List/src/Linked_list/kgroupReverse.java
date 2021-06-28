package Linked_list;

import java.util.Scanner;

public class kgroupReverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node<Integer>head=takeInput();
     	System.out.println("Enter value of k");
		int k= s.nextInt();
		Node<Integer>newHead=kReverse(head,k);
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


    public static Node<Integer> kReverse(Node<Integer>head, int k) {
    	
    	int x = k;
    	Node<Integer> head_next=null;
    	Node<Integer> h = head;
    	Node<Integer> head_prev = null;
    	while(h!=null && x>0){
    		head_next = h.next;
    		h.next = head_prev;
    		head_prev = h;
    		h = head_next;
    		x--;
    	}
    	if(head_next!=null){
    		head.next = kReverse(head_next,k);
    	}
    	return head_prev;
        }                       
            
    
  }
