package Linked_list;

public class Stack_Adapter {
	
  Node<Integer> newNode= new Node<>(32);
  Node<Integer>head;
  Node<Integer>tail;
  
  public void push(Node<Integer> head) {
	  newNode.next=head;
	  head=newNode;
	  
}
  public int size(Node<Integer> head) {
	  if(head==null){
		  return -1;
	  }
	  int count=0;
	  Node<Integer> temp=head;
	  while(temp!=null) {
		  count++;
		  temp=temp.next;
	}
	  return count;
}
  
  
  public int top(Node<Integer>head) {
	  if(head==null) {
		  return -1;
	  }
	  
	 return head.data;
  }
  
 
  public int pop(Node<Integer>head) {
	  Node<Integer> temp=head;
	  head=head.next;
	  return temp.data;
	  
}
  
  
	
}
